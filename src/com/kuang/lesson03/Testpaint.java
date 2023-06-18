package com.kuang.lesson03;

import java.awt.*;

public class Testpaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{
//    画笔方法
    public void loadFrame(){
        setBounds(500,500,600,500);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {

//        画笔1.需要有颜色，2.可以画画
        g.setColor(Color.red);
        g.drawOval(40,140,54,54);//画一个空心圆
        g.fillOval(50,50,56,56);//实心圆

        g.setColor(Color.green);
        g.fillRect(200,300,60,60);

//        可以通过监听器repaint，重新画：动画效果
//        养成习惯，画笔用完就将它还原到最初的颜色：black


    }
}
