package com.kuang.snake;

import javax.swing.*;
import java.awt.*;


/*
* 主启动类：
*
* */
public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.add(new GamePanel());


        jFrame.setBackground(Color.yellow);
        jFrame.setBounds(10,10,900,720);//900,720是算出来的大小。固定，故窗口不能拉伸
//        为了设置窗口大小不可变：
        jFrame.setResizable(false);
//        jFrame.setLayout(new FlowLayout());

        jFrame.setVisible(true);
//        其他的正常的游戏界面都应该在面板上来写： jFrame.add(new GamePanel());
    }
}
