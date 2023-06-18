package com.kuang.lesson03;
/*测试鼠标监听事件
 *思路://第一步：模块三：适配器模块获取鼠标事件的位置坐标信息；
 * //    第二步：模块二：手机鼠标事件的位置信息后，传递给集合points
 * //    第三步：模块一：拿到points的集合信息，分别迭代，每个位置画一个图像点
 * 注意适配器中的： myFrame.repaint();//每次都会刷新，重新执行public void paint(Graphics g) {}方法
 *
 *
 * */

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("我的鼠标监听器-画图");

    }
}

class MyFrame extends Frame{
    //    画笔1.需要有颜色，2.可以画画
//    1.画画需要画笔，2.需要监听鼠标当前的位置，3.需要集合来存储这个点
    ArrayList points;

    public MyFrame(String tittle) {
        super(tittle);
        setBounds(200,200,500,500);
        //        存鼠标的点：先确定存点的位置：
        points= new ArrayList<>();//点的坐标集合，而具体坐标要在监听适配器事件里获得：转适配器
        setVisible(true);
//        鼠标监听器是针对窗口的：
        this.addMouseListener(new MymouseListener());


    }



    //    模块一：拿到points的集合信息，分别迭代，每个位置画一个图像点
//通过画笔来画画
    @Override
    public void paint(Graphics g) {
//        画画需要监听鼠标的事件（给鼠标添加监听器）.
//        开始画图点，怎么画？把points位置坐标集合迭代，然后画
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point=(Point) iterator.next();//对应的迭代中的其中一个点的坐标
            g.setColor(Color.red);
            g.fillOval(point.x,point.y,10,10);//在这个点的坐标上，画了个图像点
        }

    }



    //    模块二：手机鼠标事件的位置信息后，传递给集合points
//    画是画了，得添加到界面上才能看到：
    public void addPaint(Point point){
        points.add(point);

    }




    //模块三：适配器模块获取鼠标事件的位置坐标信息
//重写全部方法很麻烦：private class MymouseListener implements MouseListener {}
// 这里用适配器模式:class MouseAdapter implements MouseListener
    private class MymouseListener extends MouseAdapter {
        //        我们只需要鼠标点击事件（点击，弹起，按住不放）
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
//        System.out.println(myFrame);//获取鼠标所在窗口的信息
//       下面写功能：在点击的时候，在页面上产生一个点：点是通过“画”，转到点位置集合；
//        这里获取具体点位置坐标
            myFrame.addPaint(new Point(e.getX(),e.getY()));//这个点就是鼠标的  点.每次鼠标事件获取到的位置，就通过自己写的方
//        法addPaint，来间接给了集合points
//        有了点的坐标，就要在这个点上添加一个图画点：转public void paint(Graphics g) {}


//        次点击鼠标都要重新画一次，而不是只执行一次（首次的points集合， 更何况里面还是空的）
            myFrame.repaint();//每次都会刷新，重新执行public void paint(Graphics g) {}方法
        }
    }

}

