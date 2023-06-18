package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* Dialog弹窗
* 弹窗也是窗口
* 默认就有关闭事件
* */

//主窗口里有按钮，点击下就跳出来Dialog新窗口
public class DialogDemo extends JFrame {
    public void init(){
        this.setVisible(true);
        this.setBounds(200,300,300,400);
        Container container = this.getContentPane();//实例化容器
//        也可以设置容器的绝对布局：
        container.setLayout(null);
        container.setBackground(Color.red);

//        写一个按钮：放在JFrame中：
        JButton jButton = new JButton("标题：点击弹出对话框");
        jButton.setBounds(30,30,200,100);//绝对定位下，这个数值是相对于布局而言的
//        按钮要有监听事件：点击时，会弹出弹框
        jButton.addActionListener(new ActionListener() {//按钮的监听器
            @Override
            public void actionPerformed(ActionEvent e) {
//                监视器的弹窗功能：
                new MyDialog();


            }
        });



        container.add(jButton);



    }

    public static void main(String[] args) {
        new DialogDemo().init();



    }
}
//弹窗的窗口
class MyDialog extends JDialog{
    public MyDialog() {
        setVisible(true);
        setBounds(200,200,50,700);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//默认就有关闭事件

        Container container = this.getContentPane();
//        container.setLayout(null);//设置wield绝对定位
        container.setBackground(Color.yellow);
        container.add(new Label("kakaroute love niuqiqi"));
    }
}
