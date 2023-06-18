package com.kuang.lesson05;
/*
* JCheckBox  多选框（复选按钮）
*
* */
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame{
    public JButtonDemo03() {
    }

    public void init(){

        Container container = this.getContentPane();
        
        this.setVisible(true);
       container.setBackground(Color.yellow);
       setSize(100,100);
//       想把图片放在图标上，1.拿到图片的地址  2.把图片地址进行图标的实例化
//       3.把图标放入标签  4.把标签放入窗口


//        1.拿到图片的地址
        URL url = JButtonDemo03.class.getResource("tx.png");
//        2.把图片地址进行图标的实例化(图片变为图标)
        ImageIcon imageIcon = new ImageIcon(url);



//         3.把图标放入标签（或者放在按钮上）
//        多选框：
        JCheckBox jCheckBox1 = new JCheckBox("多选框1");
        JCheckBox jCheckBox2 = new JCheckBox("多选框2");
        JCheckBox jCheckBox3 = new JCheckBox("多选框3");





//        4.把标签放入窗口
//        add(jLabel);
        container.add(jCheckBox1,BorderLayout.NORTH);
        container.add(jCheckBox2,BorderLayout.SOUTH);
        container.add(jCheckBox3,BorderLayout.CENTER);


    }
    public static void main(String[] args) {
        new JButtonDemo03().init();

    }
}


