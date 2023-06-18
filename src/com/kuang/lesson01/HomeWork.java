package com.kuang.lesson01;

import javafx.scene.layout.Pane;

import java.awt.*;

public class HomeWork {
    public static void main(String[] args) {
        Frame frame = new Frame();

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

        frame.setSize(700,239);


//        在窗口frame上添加按钮
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
//        frame.add(button5);
//        frame.add(button6);
//        frame.add(button7);
//        frame.add(button8);
//        frame.add(button9);
//        frame.add(button10);
//        frame.setLayout(new GridLayout(2,2));
//

//        建立面板panel
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        Panel panel5 = new Panel();
        Panel panel6 = new Panel();

//给面板添加按钮
        panel1.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel3.add(button4);

        panel4.add(button5);
        panel5.add(button6);
        panel5.add(button7);
        panel5.add(button8);
        panel5.add(button9);
        panel6.add(button10);



        panel1.setLayout(new GridLayout(1,0));
        panel2.setLayout(new GridLayout(2,0));
        panel3.setLayout(new GridLayout(1,0));
        panel4.setLayout(new GridLayout(1,0));
        panel5.setLayout(new GridLayout(2,2));
        panel6.setLayout(new GridLayout(1,0));


//        把面板添加到窗口
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
//        窗口是两行三列
        frame.setLayout(new GridLayout(2,3));






        frame.setVisible(true);




    }
}
