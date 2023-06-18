package com.kuang.lesson01;
/*
*
* 表格布局
* */

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {

        Frame frame = new Frame("欢迎来到表格布局");
        //        组件—按钮：
        Button button1 = new Button("bulma_button1");
        Button button2 = new Button("qiqi_button2");
        Button button3 = new Button("kakaroute_button3");
        Button button4 = new Button("lanqier_button4");
        Button button5 = new Button("bike_button5");

        frame.setLayout(new GridLayout(3,15));
        //        在窗口frame上添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

//        有一个java函数，pack().自动选择最佳位置
//        frame.pack();//自动布局



        frame.setSize(800,700);//设置默认大小
        frame.setVisible(true);




    }
}
