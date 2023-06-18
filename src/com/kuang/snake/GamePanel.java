package com.kuang.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/*
 * 时间监听中的定时器（这个事件监听需要通过定时器（ new Timer）来进行）；实现ActionListener+重写事件监听方法
 * 另：定时器的使用，即1.new出来  2.构造器或者init中，start一下（timer.start();）
 *
 * 至于动起来，只要让其实现监听即可：键盘监听器。昨天说过，监听器可以写在内部类中，所以最暴力的方式
 * 是直接在类上实现接口implements KeyListener （当前类中直接override进行写即可）。不用新写类了降低成本
 * 当然写了监听事件后，监听事件如果需要让他被开启（能够被监听），我们需要获取键盘的一些监听：这里在初始化构造器里获得焦点事件、获得键盘监听事件。写完键盘就能被监听到
 * */

/*游戏的面板。
 * */
public class GamePanel extends JPanel implements KeyListener , ActionListener {
    // 绘制面板，我们游戏中的所有东西，都画在面板里
//    定义蛇的数据结构：
    int length;//蛇的长度，最长816满格
    int snakeX[]=new int[600];//蛇的X坐标
    int snakeY[]=new int[500];//蛇的y坐标.
    // 比如  x【0】y【0】指的是头的坐标； x【1】y【1】是第一个身体


    //    定义方向：
    String fx;//初始方向向右

    //    食物的坐标
    int foodX;
    int foodY;
    Random random=new Random();

    //    分数的定义
    int score;


    //    游戏当前的状态：开始、停止
    boolean isStart=false;//默认不开始


    //    游戏状态失败的判断：默认是不失败
    boolean isFail=false;


    //    定时器：ActionListener
    Timer timer=new Timer(100,this);//100ms执行一次



    public GamePanel() {
        init();
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//获得键盘监听事件（因为当前类就有键盘事件，因此
        // this。如果监听事件是另一个类，可以不this，而是直接new一个键盘监听事件类）
        timer.start();//游戏一开始定时器就启动
    }

    //    每次的初始化方法：
    public void init(){
        fx="R";
        length=3;//初始化有3节
        snakeX[0]=100;snakeY[0]=100;//头的位置，定在100,100处
        snakeX[1]=75;snakeY[1]=100;//第一个身体的位置，定在75,100处（每个方格是265长）
        snakeX[2]=50;snakeY[2]=100;//第二个身体的位置，定在50,100处

//       食物的随机分布
        foodX=25+25*random.nextInt(34);//34是850/25;一共有34个格子
        foodY=75+25*random.nextInt(24);

        score=0;
    }





    //绘制面板，我们游戏中的所有东西，都是用这个画笔来画
    @Override//在重写方法集中找到这个方法：画组件方法
    protected void paintComponent(Graphics g) {//用这个g画笔进行绘制
        super.paintComponent(g);//清屏的作用（不用这个父类，也可以，但是会出现闪屏，闪烁）
        setBackground(Color.white);


//        绘制静态面板：
        Data.header.paintIcon(this,g,25,11);//头部广告栏的绘制

//        画一个黑色的矩形
        g.fillRect(25,75,850,600);

        //        画食物：
        Data.food.paintIcon(this,g,foodX,foodY);//食物的初始化位置

//        把小蛇画上去：
        if (fx.equals("R")){//说明是初始化的绘制
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化的位置，向右.后面的方向判断
        }else if (fx.equals("L")){                //非初始化的绘制
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化的位置，向右.后面的方向判断
        }else if (fx.equals("U")){                  //非初始化的绘制
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化的位置，向右.后面的方向判断
        }else if (fx.equals("D")){                  //非初始化的绘制
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化的位置，向右.后面的方向判断
        }

        //        画积分：
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));//设置字体

        g.drawString("长度:"+length,750,35);
        g.drawString("分数:"+score,750,65);


        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);//蛇第一个身子初始化的位置
        }

//        Data.body.paintIcon(this,g,snakeX[1],snakeY[1]);//蛇第一个身子初始化的位置
//        Data.body.paintIcon(this,g,snakeX[2],snakeY[2]);





        //    游戏状态：如果是未开始，那么就输入一段文字
        if(isStart==false){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));//设置字体

            g.drawString("按下空格开始新游戏",300,300);
        }

        if(isFail){
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));//设置字体

            g.drawString("你输了，按下空格重新开始",300,300);
        }


        setVisible(true);
    }




    //    至于动起来，只要让其实现监听即可：键盘监听器
    //键盘监听事件implements方法：
    @Override
    public void keyTyped(KeyEvent e) { }
    @Override
    public void keyReleased(KeyEvent e) { }


    //（小蛇移动）键盘监听事件：
    @Override
    public void keyPressed(KeyEvent e) {
//        1.首先获得键盘的按键：
        int keyCode=e.getKeyCode();
//        2.判断
        if(keyCode==KeyEvent.VK_SPACE){//如果是空格键的话
            if (!isFail) {
                isStart=!isStart;//取反
                repaint();//重画
            } else {
//                重新开始
                isFail=false;
                init();
            }

        }


//        对蛇方向的监听：这里方向变即也会改变头的图标，但是整体蛇的动作是往上往下还是在事件监听中判断完成的：即把头的图标改变+通过把头的坐标设置到下面的坐标，这样后面的身体进行头的原来的位置，进行循环
        if(keyCode==KeyEvent.VK_UP){//如果是上键的话
            fx="U";

            repaint();//重画

        }else if(keyCode==KeyEvent.VK_DOWN){
            fx="D";
        }else if (keyCode==KeyEvent.VK_LEFT){
            fx="L";
        }else if(keyCode==KeyEvent.VK_RIGHT){
            fx="R";

        }


    }





    //事件监听：这个事件监听需要通过定时器来进行。需要通过固定的时间来刷新，比如1s 10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart&&isFail==false){//如果游戏是开始状态，就让小蛇动起来：初始化的时候是右移
//            吃食物
            if(snakeX[0]==foodX&&snakeY[0]==foodY){//头与食物重合了
                length++;//长度加一
                score+=10;
//                再次随机食物
                foodX=25+25*random.nextInt(34);//34是850/25;一共有34个格子
                foodY=75+25*random.nextInt(24);

            }


//    这里注意是先让身子覆盖头，再把头向前移动一个才不会被覆盖住。因为身体的最开始的那个，要走到原来的头的[0][0]处，如果你[0][0]已经提前写
//     到下一位，那么for循环的最后一轮snakeX[1]=snakeX[0]就会出问题， 即把新的头的位置覆盖。
//            1.身子右移
            for (int i = length-1; i >0 ; i--) {//后一节向前一节的位置进行移动.注意这里是i--,如果用i++会导致覆盖
//                snakeX[i]+=25;
                snakeX[i]=snakeX[i-1];//身体迁移。这里保证只要头动，其他的都会动
                snakeY[i]=snakeY[i-1];

            }

            //            2.头右移
//            2.1头动之前判断方向；
            if(fx.equals("R")){
                snakeX[0]+=25;
                //边界判断：
                if ( snakeX[0]>850){   //大于850就是飞出来屏幕
                    snakeX[0]=25;//又回到最初的起点，呆呆地站在镜子前
                }
            }else if(fx.equals("U")){
                snakeY[0]-=25;
                //边界判断：
                if ( snakeY[0]<75){   //大于850就是飞出来屏幕
                    snakeY[0]=650;//又回到最初的起点，呆呆地站在镜子前
                }
            }else if(fx.equals("L")){
                snakeX[0]-=25;
                //边界判断：
                if ( snakeX[0]<25){   //大于850就是飞出来屏幕
                    snakeX[0]=850;//又回到最初的起点，呆呆地站在镜子前
                }
            }else if(fx.equals("D")){
                snakeY[0]+=25;
                //边界判断：
                if ( snakeY[0]>650){   //大于850就是飞出来屏幕
                    snakeY[0]=75;//又回到最初的起点，呆呆地站在镜子前
                }
            }


//            怎样做会失败：撞到自己就算失败
            for (int i = 1; i <length ; i++) {
                if(snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]){
                    isFail=true;
                }

            }

            repaint();//重画页面

        }
        timer.start();//定时器开启！
    }
}


