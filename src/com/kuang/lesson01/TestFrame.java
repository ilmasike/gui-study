package com.kuang.lesson01;
/*frame：窗口框架*/

import java.awt.*;

//GUI的第一个界面。万物皆是对象，而Frame也是一个对象，可以实例化
public class TestFrame {
    public static void main(String[] args) {
//        Frame对象：z
        Frame frame = new Frame("我的第一个java图像界面窗口");//这个类怎么使用，1是看源码，2是看jdk文档
//仅仅有窗口，怎么显示呢？（在内存里，看不到）。所以设置可见性。




//        方法的类名，直接".",来找到设置可见性的方法
        frame.setVisible(true);



//        窗口的长宽高的设置：
        frame.setSize(400,400);





//        设置背景颜色：
        frame.setBackground(Color.red);//setBackground(Color bgColor) {},该怎么写？看Color的源码
//        Color color = new Color();这不是代码，而是通过这个看Color的源码，点进去发现可以设置rgb，
//        那么就可以:frame.setBackground(new Color(2,34,211));这里frame.setBackground(Color.red);是默认的红色


//        弹出的初始位置：
        frame.setLocation(200,200);

//        设置它不能变化拉伸（大小固定）
        frame.setResizable(false);



    }
}
