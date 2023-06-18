package com.kuang.lesson05;
/*  new JRadioButton()单选框按钮*/
//常用  分组来   实现
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame{
    public JButtonDemo02() {
    }

    public void init(){

        Container container = this.getContentPane();

        this.setVisible(true);
       container.setBackground(Color.yellow);
       setSize(100,100);
//       想把图片放在图标上，1.拿到图片的地址  2.把图片地址进行图标的实例化
//       3.把图标放入标签  4.把标签放入窗口


//        1.拿到图片的地址
        URL url = JButtonDemo02.class.getResource("tx.png");
//        2.把图片地址进行图标的实例化(图片变为图标)
        ImageIcon imageIcon = new ImageIcon(url);



//         3.把图标放入标签（或者放在按钮上）
//        新建单选框按钮
        JRadioButton jRadioButton1 = new JRadioButton("单选框1");
        JRadioButton jRadioButton2 = new JRadioButton("单选框2");
//        由于单选框只能选择一个，通常用  分组来   实现
        ButtonGroup buttonGroup = new ButtonGroup();//新建按钮组
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);


//        4.把标签放入窗口
//        add(jLabel);
        container.add(jRadioButton1,BorderLayout.NORTH);
        container.add(jRadioButton2,BorderLayout.SOUTH);




    }
    public static void main(String[] args) {
        new JButtonDemo02().init();

    }
}


