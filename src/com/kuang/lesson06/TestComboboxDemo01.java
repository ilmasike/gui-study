package com.kuang.lesson06;
/*
* JComboBox:组合下拉框,也就是那个带下拉箭头的框
* * 应用场景：选择地区或者一些只选择单个选项的
* 这个demo的展示效果，是直接放在container里面，所以不美观。正常是放在panel里
* */
import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo01 extends JFrame {
    public TestComboboxDemo01()  {
    }

    public void init(){
//        初始化的一些基本操作:
        Container container = this.getContentPane();
        this.setVisible(true);
        container.setBackground(Color.yellow);
        setBounds(100,100,500,350);
//        新建下拉框
        JComboBox objectJComboBox = new JComboBox();
        objectJComboBox.addItem("正在上映");//给下组合拉框，添加下拉主题
        objectJComboBox.addItem("已下架");
        objectJComboBox.addItem(null);
        objectJComboBox.addItem("即将上映");

        container.add(objectJComboBox);
    }

    public static void main(String[] args) {
        new TestComboboxDemo01().init();

    }
}
