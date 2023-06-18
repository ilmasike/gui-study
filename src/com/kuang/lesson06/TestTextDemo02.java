package com.kuang.lesson06;
/*
*密码框：JPasswordField
* */
import javax.swing.*;
import java.awt.*;

public class TestTextDemo02 extends JFrame {
    public TestTextDemo02()  {
    }
    public void init(){
//        初始化的一些基本操作:
        Container container = this.getContentPane();
        this.setVisible(true);
        container.setBackground(Color.yellow);
        setBounds(100,100,500,350);
//        设置布局：
        container.setLayout(new FlowLayout());

//        新建密码框：
        JPasswordField jPasswordField1 = new JPasswordField("我是密码狂",20);//默认显示：****，不用再单独设置成这样
//        也可以单独设置显示效果
        jPasswordField1.setEchoChar('s');
        JPasswordField jPasswordField2 = new JPasswordField("我是密码狂ddd",50);

        container.add(jPasswordField1);
        container.add(jPasswordField2);
    }

    public static void main(String[] args) {
        new TestTextDemo02().init();

    }
}
