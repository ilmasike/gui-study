package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* 监听事件
* */
public class TestAction {
    public static void main(String[] args) {
        Frame frame = new Frame("窗口栏目");
//        按下一些按钮，触发一些事件
        Button button = new Button("one_button");
        frame.add(button,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.pack();

//        因为，addActionListener需要一个Actionlistener,但这是接口，所以我们实现了这个接口来构造一个类
        MyActionlistener myActionlistener = new MyActionlistener();

        button.addActionListener(myActionlistener);//为按钮添加监听事件



        windowClose(frame);//关闭事件


    }


//    封装一个关闭窗口的事件
    public static void windowClose(Frame frame) {

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

}
//自己写的事件监听：触发后的功能实现
class MyActionlistener implements  ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaaaa");

    }
}
