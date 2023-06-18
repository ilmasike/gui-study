package com.kuang.lesson01;
/*刚刚创建了一个frame窗口。想创建多个？可以把这个方法封装起来使用*/

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
//        展示多个窗口  ：new  多个对象，太麻烦。自己写一个类：用继承
        MyFrame myFrame=new MyFrame(100,200,330,440,Color.red);
        MyFrame myFrame2=new MyFrame(300,200,330,440,Color.blue);
        MyFrame myFrame3=new MyFrame(600,200,330,440,Color.yellow);
        MyFrame myFrame4=new MyFrame(900,200,330,440,Color.red);
        MyFrame myFrame5=new MyFrame(100,300,330,440,Color.black);
        MyFrame myFrame6=new MyFrame(300,300,330,440,Color.pink);
        MyFrame myFrame7=new MyFrame(1300,200,330,440,Color.red);

    }
}

class MyFrame extends Frame {
    static int id=0;//可能存在多个窗口，所以我们需要一个计数器
//    写构造器(构造方法)
    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame"+(++id));
//        frame.setVisible(true);这本来就是父类，可以直接调用方法，
        setVisible(true);
        setSize(400,400);
        setBounds(x, y, w, h);
        setBackground(color);
    }



}
