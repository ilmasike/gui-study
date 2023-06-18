package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* 简易计算器
* */
public class TextCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        windowClose(calculator);



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


//计算器类
class Calculator extends Frame{
    public Calculator()  {
//        3个文本框
        TextField textField1 = new TextField(10);//最大能够填写10个字符
        TextField textField2 = new TextField(10);
        TextField textField3 = new TextField(20);


//        1个按钮
        Button button = new Button("=");
//        加上监听事件
        button.addActionListener(new MyCalculateListener(textField1,textField2,textField3));

//        1个标签（加号：没有功能，只是给人展示出来的加号）
        Label label = new Label("+");

//        采用流式布局（从左到右）
        setLayout(new FlowLayout());
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);
        pack();
        setVisible(true);

    }
}

//监听器类
class MyCalculateListener implements ActionListener{
    //        1.获取三个变量
    private TextField a,b,c;
    public MyCalculateListener(TextField a,TextField b,TextField c) {
        this.a=a;
        this.b=b;
        this.c=c;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        1.获得加数与被加数
        Integer integer_a = new Integer(a.getText());
        Integer integer_b = new Integer(b.getText());
//        Integer integer_c = new Integer(c.getText());

//        2.将这个值放到第三个框
        int cc=(integer_a+integer_b);
        c.setText(cc+"");
//        3.清除前两个框
        //        为了安全可以设置，回车后清空文本
        a.setText("");
        b.setText("");


    }
}




















































