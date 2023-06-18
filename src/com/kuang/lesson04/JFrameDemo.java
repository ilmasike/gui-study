package com.kuang.lesson04;
/*
* JFrame是一个顶级窗口，本质也是一个容器。但是与awt不同的是，容器的颜色才是他的颜色container.setBackground(Color.red);
* 以前的awt是直接 jFrame.setBackground(Color.red);这里要先容器实例化，然后  jFrame.getContentPane().setBackground(Color.red);
*
* 就比Frame多了个容器Container
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JFrameDemo {
//    初始化：
    public void init(){
        JFrame jFrame = new JFrame("这个就是类似于Frame的tittle");
        jFrame.setVisible(true);
        jFrame.setBounds(200,200,400,400);
//        jFrame.setBackground(Color.red);
//        关闭操作，以前是用监视器：现在在Swing类中，不用这么麻烦
//        jFrame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//        设置文字:
        JLabel label=new JLabel("欢迎来到王者荣耀");
        jFrame.add(label);
//        容器实例化
        jFrame.getContentPane().setBackground(Color.red);





    }
    public static void main(String[] args) {
//        1.建立一个窗口
//        窗口一般是初始化就出来的（init()），不用通过类
        new JFrameDemo().init();

    }
}
