package com.kuang.lesson05;
/*面板JPanel*/

import com.kuang.lesson04.JFrameDemo;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    public JPanelDemo() {
    }

    public void init(){
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));//设置表格布局：后面两个参数是上下间距
//        新建面板，放入Frame窗口中
        JPanel jPanel = new JPanel(new GridLayout(1,3));
        JPanel jPanel1 = new JPanel(new GridLayout(2,1));
        JPanel jPanel2 = new JPanel(new GridLayout(1,2));

        container.add(jPanel);
        container.add(jPanel1);
        container.add(jPanel2);


//添加按钮：
        jPanel.add(new JButton("button——1"));
        jPanel.add(new JButton("button——2"));
        jPanel.add(new JButton("button——3"));

        jPanel1.add(new JButton("button——1"));
        jPanel1.add(new JButton("button——2"));
        jPanel1.add(new JButton("button——3"));
        jPanel1.add(new JButton("button——4"));
        jPanel1.add(new JButton("button——5"));
        jPanel1.add(new JButton("button——6"));

        jPanel2.add(new JButton("button——1"));
        jPanel2.add(new JButton("button——2"));
        jPanel2.add(new JButton("button——3"));
        jPanel2.add(new JButton("button——4"));
        jPanel2.add(new JButton("button——5"));
        jPanel2.add(new JButton("button——6"));

        setVisible(true);
        this.setBounds(300,300,700,400);




    }





    public static void main(String[] args) {
        new JPanelDemo().init();

    }
}
