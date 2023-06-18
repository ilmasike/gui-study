package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

public class ImageIconDemo extends JFrame implements Icon {
    private int Height;
    private int Weight;
    public ImageIconDemo()  {
    }

    public ImageIconDemo(int height, int weight) {
        this.Height = height;
        this.Weight = weight;
    }

    public void init ()  {
//        想把图片搞成图标，首先获取图片的地址：
//        FileInputStream fileInputStream = new FileInputStream("public ImageIcon()  {\n" +
//                "    }");
        URL url = ImageIconDemo.class.getResource("jt.png");
//        有了地址，把图片地址 变为图标：
        ImageIcon imageIcon1 = new ImageIcon(url);// 实例化Icon对象：图片图标.注意这里的ImageIcon是系统自带的类



//        上个demo是把图标（椭圆）放入标签，现在我们把图片放入标签
//        JLabel jLabel1 = new JLabel("我是标签，我上面有图片图标哦",imageIcon1,SwingConstants.CENTER);
        JLabel jLabel1 = new JLabel("我是标签,我上面有图片哦");
        jLabel1.setIcon(imageIcon1);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);


        this.setVisible(true);
        this.setBounds(300,300,400,500);
        Container container = getContentPane();
        container.setBackground(Color.yellow);
        container.add(jLabel1);



    }







    public static void main(String[] args) {
        new ImageIconDemo().init();

    }



    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        System.out.println("我爱你");
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
