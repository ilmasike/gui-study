package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;

/*
* （标签组件）图标Icon是一个接口，需要一个实现类，因为标签组件是写在窗口里的，所以类要继承JFrame
* */
public class IconDemo  extends JFrame implements Icon {
   private int Width;
   private int Height;

    public IconDemo() { }



    public IconDemo(int width, int height)  {
        this.Width=width;
        this.Height=height;
    }

    public void init (){
        IconDemo iconDemo = new IconDemo(30,30);//新建图标，图标可以放在标签、按钮等地方
        JLabel jlabel=new JLabel("icon_test",iconDemo,SwingConstants.CENTER);//新建标签,把图标放在标签上，位置为中间
        setVisible(true);
        setBounds(300,300,500,500);

        Container container = this.getContentPane();
        container.setBackground(Color.red);
        add(jlabel);
//        container.add(jlabel);

    }






    public static void main(String[] args) {
        new IconDemo().init();
    }



    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
//        画图需要怎么画？
        g.fillOval(x,y,this.Width-20,this.Height-10);//下面设置了图标的长宽
//        这里就时怎么对图标进行画（画的大小，不影响图标的大小。下面已经把图标大小确定了为this.Width）。

    }

    @Override
    public int getIconWidth() {
        return this.Width;
    }//设置了图标的长宽

    @Override
    public int getIconHeight() {
        return this.Height;
    }



}
