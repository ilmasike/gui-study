package com.kuang.lesson01;

import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HomeWork3 {
    public static void main(String[] args) {
        Frame frame = new Frame("模仿狂进行新建窗口,布局管理器的嵌套使用");
        frame.setSize(400,500);
        frame.setVisible(true);

        frame.setLayout(new GridLayout(2,1));

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));
//窗口的第一行
        panel1.add(new Button("first_button"),BorderLayout.WEST);
        panel1.add(new Button("second_button"),BorderLayout.EAST);

//        panel2.setLayout(new GridLayout(2,1));
        for (int i = 0; i <2 ; i++) {
            panel2.add(new Button("button"+i));
        }
        panel1.add(panel2,BorderLayout.CENTER);

//        同理，窗口的第二行
        panel3.add(new Button("first_button"),BorderLayout.WEST);
        panel3.add(new Button("second_button"),BorderLayout.EAST);

//        panel4.setLayout(new GridLayout(2,2));
        for (int i = 0; i <4 ; i++) {
            panel4.add(new Button("button"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);




        frame.add(panel1);
        frame.add(panel3);

//        添加监听事件：
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });




    }
}
