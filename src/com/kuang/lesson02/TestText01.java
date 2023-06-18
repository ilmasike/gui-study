package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }
}

class MyFrame extends Frame{
    public MyFrame() {
//        TextArea textArea = new TextArea();//多行文本
        TextField textField = new TextField();//单行文本
        add(textField);//放入文本框


//        监听文本框中输入的内容.默认按下回车就会触发输入框的监听事件
        textField.addActionListener(new MyaddActionListener());
        pack();

//        设置替换编码
        textField.setEchoChar('*');
        setVisible(true);



    }
}

class  MyaddActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField t=(TextField)e.getSource();//获得一些资源,返回一个对象
        System.out.println(t.getText());
//        为了安全可以设置，回车后清空文本
        t.setText("");//设置为空，注意不是null，null是一个对象哦


    }
}
