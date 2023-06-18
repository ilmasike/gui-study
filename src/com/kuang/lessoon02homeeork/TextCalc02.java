package com.kuang.lessoon02homeeork;
/*使用内部类的方式，来实现计算器的功能*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextCalc02 {

        public static void main(String[] args) {
            new Calc_lounchin().c_lounch();


    }
}

//写一个启动计算器的类
class Calc_lounchin extends Frame {
    TextField t1,t2,t3;
    public void c_lounch(){
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
            button.addActionListener(new C_ActionListener());
            setVisible(true);
            setLayout(new FlowLayout());
            setSize(500,500);


    }
    class C_ActionListener implements ActionListener {
//    功能：按钮要有监听事件：1.拿到前两个数，2.把第三个数等于前两个数的和  3.前两个数清空


        @Override
        public void actionPerformed(ActionEvent e) {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int n3=n1+n2;
           t3.setText(String.valueOf(n3));

            t1.setText("");
            t2.setText("");

        }
    }



}




