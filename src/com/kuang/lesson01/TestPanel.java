package com.kuang.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Panel可以看成是一个空间，但是不能单独存在，要放在frame上
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();//总的窗口
        Panel panel = new Panel();//点进去源代码，有个布局的概念。

//        设置布局
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);//      坐标
//        frame.setBackground(Color.red);
        frame.setBackground(new Color(200,3,8));


//        panel也是可以设置坐标等的,是相对于frame的
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(69, 255, 40));


//        frame添加panel
        frame.add(panel);


        frame.setVisible(true);


//        监听事件：监听窗口关闭事件 System.exit(0);
//        适配器模式：因为WindowListener有太多方法要重写，这里用他的适配器（这个适配器是implements了WindowListener
//        同时，只选取需要的方法重写即可）
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                这里是窗口点击关闭时候，需要做的事情

                System.exit(0);
            }
        });





    }
}
