package com.kuang.lesson01;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
//        组件—按钮：
        Button button1 = new Button("bulma_button1");
        Button button2 = new Button("qiqi_button2");
        Button button3 = new Button("kakaroute_button3");
        Button button4 = new Button("lanqier_button4");
        Button button5 = new Button("bike_button5");

//        把窗口设置为流式布局：
//        frame.setLayout(new FlowLayout());//默认是CENTER,中间
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));//public class FlowLayout implements LayoutManager, java.io.Serializable {}
//        实现了LayoutManager接口，此接口点开有大量的实现类，流式布局FlowLayout()只是其中之一。
//        与之类似的实现类：BorderLayout东西南北中布局



//        frame.setBounds(400,400,400,400);

        frame.setSize(700,239);

//        在窗口frame上添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.setVisible(true);



    }
}
