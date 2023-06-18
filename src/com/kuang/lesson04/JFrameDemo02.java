package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJFrame02().init();
    }
}

class MyJFrame02 extends JFrame{
    public void init(){
        this.setVisible(true);
        this.setBounds(200,300,400,400);
        //容器实例化，获得容器
        Container container = this.getContentPane();
        container.setBackground(Color.blue);//实例化容器后再上色
        //        设置文字:
        JLabel label=new JLabel("欢迎来到王者荣耀");
        this.add(label);

//        让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
