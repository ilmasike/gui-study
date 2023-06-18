package com.kuang.lesson03;
/*键盘监听事件
*
* */

import javax.xml.transform.Source;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new MyKeyFrame();

    }
}

class MyKeyFrame extends Frame {
    public MyKeyFrame()  {
        setVisible(true);
        setBackground(Color.green);
        setBounds(200,200,300,400);
        setTitle("消灭人类暴政，世界属于三体");
        setTitle("不惑前廿十年，与河朔群雄争锋，莫有抗者。呜呼！群雄束手，不亦悲乎————剑魔老先生独孤求败");

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
//                键盘按下的操作效果：输出按下的键值
                if (e.getKeyCode()==KeyEvent.VK_UP) {
                    System.out.println("你这是按下了上键");
                }

                System.out.println((char)e.getExtendedKeyCode()+"对应的keycode为："+(char) e.getKeyCode());
            }
        });

        addWindowListener(new WindowAdapter() {
//            鼠标监听事件：关闭功能
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("我要把你关闭了，是我配不上你，对不起你是个好人，再见");
                System.out.println("天上星，亮晶晶，永灿烂，常安宁！");
                System.out.println("湖边竹，绿油油，报平安，多喜乐！");
                System.out.println("有常无常，双数枯荣。南北西东，非假非空！");
                System.exit(0);


            }
        });
    }
}
