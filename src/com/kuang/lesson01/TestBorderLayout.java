package com.kuang.lesson01;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("卡卡罗特的东西南北中布局");//有窗口了

        frame.setLayout(new BorderLayout());//东西南北中的布局
        Button button1 = new Button("bulma_east");
        Button button2 = new Button("bulma_west");
        Button button3 = new Button("bulma_north");
        Button button4 = new Button("bulma_south");
        Button button5 = new Button("bulma_center");


        frame.setSize(800,700);//设置默认大小
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
//        frame.add(button5);//有按钮了

        frame.add(button1,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);
        frame.add(button3,BorderLayout.NORTH);
        frame.add(button4,BorderLayout.SOUTH);
        frame.add(button5,BorderLayout.CENTER);//有按钮了

        frame.setVisible(true);//窗口是可见的



    }
}
