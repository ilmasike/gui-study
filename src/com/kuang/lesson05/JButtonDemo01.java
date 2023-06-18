package com.kuang.lesson05;
/* jButton.setToolTipText("【图片按钮】我叫浮窗小提示");*/

import com.kuang.lesson04.ImageIconDemo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame implements Icon {
    public JButtonDemo01() {
    }

    public void init(){

        Container container = this.getContentPane();
        this.setLayout(new FlowLayout());
        this.setVisible(true);
       container.setBackground(Color.yellow);
       setBounds(100,100,500,400);
//       想把图片放在图标上，1.拿到图片的地址  2.把图片地址进行图标的实例化
//       3.把图标放入标签  4.把标签放入窗口


//        1.拿到图片的地址
        URL url = JButtonDemo01.class.getResource("tx.png");
//        2.把图片地址进行图标的实例化(图片变为图标)
        ImageIcon imageIcon = new ImageIcon(url);
//         3.把图标放入标签（或者放在按钮上）
//        JLabel jLabel = new JLabel("我是标签的文本，我上面有图片图标：");
//        jLabel.setIcon(imageIcon);
        JButton jButton = new JButton("咱家是按钮，名字嘛，还没想好");
        jButton.setToolTipText("【图片按钮】我叫浮窗小提示");
        jButton.setIcon(imageIcon);

//        4.把标签放入窗口
//        add(jLabel);
        add(jButton);



    }
    public static void main(String[] args) {
        new JButtonDemo01().init();

    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
