package com.kuang.lesson01;

import java.awt.*;

public class Homework2 {
    public static void main(String[] args) {
        Frame frame = new Frame();//有了窗口
        frame.setSize(700,239);
        frame.setBackground(Color.red);
        //        窗口是两行三列
        frame.setLayout(new GridLayout(2,2));
        frame.setVisible(true);



        Button button1 = new Button("bulma_button1");
        Button button2 = new Button("qiqi_button2");
        Button button3 = new Button("kakaroute_button3");
        Button button4 = new Button("lanqier_button4");
        Button button5 = new Button("bike_button5");
        Button button6 = new Button("bulma_button6");
        Button button7 = new Button("qiqi_button7");
        Button button8 = new Button("kakaroute_button8");
        Button button9 = new Button("lanqier_button9");
        Button button10 = new Button("bike_button10");




//        添加按钮：第一行的第一列

        frame.add(button1,BorderLayout.WEST);



//        添加面板：第一行的第二列：
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        panel1.add(button2);
        panel1.add(button3);
        panel1.setLayout(new GridLayout(2,0));
        frame.add(panel1,BorderLayout.CENTER);



//        第一行的最后一列

        frame.add(button4,BorderLayout.EAST);


//        添加按钮：第二行的第一列

        frame.add(button5,BorderLayout.WEST);

//        添加面板：第一行的第二列：
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.setLayout(new GridLayout(2,3));
        frame.add(panel2,BorderLayout.CENTER);


        //        第二行的最后一列
        frame.add(button10,BorderLayout.EAST);







    }
}
