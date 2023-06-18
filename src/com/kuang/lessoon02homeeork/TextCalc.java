package com.kuang.lessoon02homeeork;

/*
* 思路：要做一个计算器
*      需要：1窗口，3个文本框，一个加号标签，一个等号按钮
*      功能：按钮要有监听事件：1.拿到前两个数，2.把第三个数等于前两个数的和  3.前两个数清空
* */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextCalc {

    public static void main(String[] args) {
        new MyCalFramee().lounchCalc();
    }
}

class MyCalFramee extends Frame{
//    写一个启动计算器的方法

    TextField t1,t2,t3;
    public void lounchCalc(){
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(20);

        Label label = new Label("+");


        Button button = new Button("=");

        add(t1);
        add(label);
        add(t2);
        add(button);
        add(t3);

//        功能上：按钮要有监听事件：
        button.addActionListener(new CCalcAction(this));
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);

    }


}

//写一个监听事件的实现类
class CCalcAction implements ActionListener{
//     功能：按钮要有监听事件：1.拿到前两个数，2.把第三个数等于前两个数的和  3.前两个数清空
    MyCalFramee myCalFramee=null;

    public CCalcAction(MyCalFramee myCalFramee) {
        this.myCalFramee=myCalFramee;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1=Integer.parseInt(myCalFramee.t1.getText());
        int n2=Integer.parseInt(myCalFramee.t2.getText());
        int n3=n1+n2;
        myCalFramee.t3.setText(String.valueOf(n3));

        myCalFramee.t1.setText("");
        myCalFramee.t2.setText("");


    }
}
