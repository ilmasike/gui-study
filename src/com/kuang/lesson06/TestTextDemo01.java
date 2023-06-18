package com.kuang.lesson06;
/*
*文本框：JTextField
* */
import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestTextDemo01 extends JFrame {
    public TestTextDemo01()  {
    }
    public void init(){
//        初始化的一些基本操作:
        Container container = this.getContentPane();
        this.setVisible(true);
        container.setBackground(Color.yellow);
        setBounds(100,100,500,350);
//        设置布局：
        container.setLayout(new FlowLayout());

//        新建文本框：
        JTextField jTextField = new JTextField("孙悟空",200);//20规定文本域长度大小
        JTextField jTextField2 = new JTextField("牛琪琪");

        container.add(jTextField);
        container.add(jTextField2);
    }

    public static void main(String[] args) {
        new TestTextDemo01().init();

    }
}
