package com.kuang.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Kuang_homework3 {
    public static void main(String[] args) {

//这里主要是对显示窗体进行设置
        Frame frame = new Frame("布局管理器的嵌套使用");
//把整个窗体分成2行1列的表格布局
        frame.setLayout(new GridLayout(2,1));
        frame.setLocation(300,400);
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setBackground(new Color(204,204,255));
//这里主要是对Panel进行布局的设置
        Panel p1 = new Panel(new BorderLayout());
//p2使用2行1列的表格布局
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
//p4使用2行2列的表格布局
        Panel p4 = new Panel(new GridLayout(2,2));
//这里主要是把按钮元素加入到Panel里面
        p1.add(new Button("East(p1-东)"),BorderLayout.EAST);
        p1.add(new Button("West(p1-西)"),BorderLayout.WEST);
        p2.add(new Button("p2-Button1"));
        p2.add(new Button("p2-Button2"));
//p1里面嵌套p2，把p2里面的按钮作为p的中间部分装入到p1里面
//把p2作为元素加入到p1里面
        p1.add(p2,BorderLayout.CENTER);
        p3.add(new Button("East(p3-东)"),BorderLayout.EAST);
        p3.add(new Button("West(p3-西)"),BorderLayout.WEST);
        for(int i=0;i<4;i++){
            p4.add(new Button("p4-Button"+i));
        }
//p3里面嵌套p4，把p4里面的按钮作为p的中间部分装入到p3里面
        p3.add(p4,BorderLayout.CENTER);
//把Panel装入Frame里面,以便于在Frame窗体中显示出来
        frame.add(p1);
        frame.add(p3);


//        添加监听器,用适配器添加
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
