package com.kuang.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestWindow {
    public static void main(String[] args) {
        new WindowListenerFrame();


    }
}

class WindowListenerFrame extends Frame{
    public WindowListenerFrame() {
        setVisible(true);
        setBounds(100,100,500,500);
        setBackground(Color.red);
//        addWindowListener(new MyWindowListener() );//这个是配合自己写的MyWindowListener()内部类


//        窗口监听事件的匿名内部类
        this.addWindowListener(new WindowAdapter() {//匿名内部类，就不用再去写 addWindowListener(new MyWindowListener() );

            //比较常见的方法：激活窗口，关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("你点击了关闭");
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {//激活，比如正常是高亮的，离开就变灰色。（当然这里的效果是你从最小化放大时，会输出语句）
                WindowListenerFrame source = (WindowListenerFrame)e.getSource();
                source.setTitle("你正在激活傻妞");//最大化后的窗口效果
                System.out.println("windowsActivated");
            }


        });

    }


}
