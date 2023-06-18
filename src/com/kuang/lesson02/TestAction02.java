package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*两个按钮，实现同一个监听
*getActionCommand（），获取按钮上的信息.这个功能可以让，多个按钮公用同一个监听器
* */
public class TestAction02 {
    public static void main(String[] args) {
        Frame frame = new Frame("start,end按钮都实现监听");
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setLayout(new BorderLayout());


//        按钮相关操作
        Button button1 = new Button("start");
        Button button2 = new Button("end");

        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.EAST);

//        button1.setActionCommand("开始喽的setActionCommand");
//        给按钮添加监听事件
        button1.addActionListener(new MybuttonAction());
        button2.addActionListener(new MybuttonAction());








//        给窗口关闭功能：
        windowClose(frame);







    }

    public static void windowClose(Frame frame) {

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}

class MybuttonAction implements ActionListener{


//    @Override
//    public void actionPerformed(Button button) {
//
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了,信息为：");
//        可以通过e得到一些信息：e.getActionCommand()获取按钮信息
        System.out.println(e.getActionCommand());//对应button1.setActionCommand("开始喽的setActionCommand");
        if((e.getActionCommand()).equals("start")){
            System.out.println("执行start");
        }else{
            System.out.println("不是start的执行");
//        }

    }
}}
