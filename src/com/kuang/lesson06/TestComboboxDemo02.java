package com.kuang.lesson06;
/*
* JList列表框，不是下拉而是直接展示：
* 列表：展示信息，一般是动态扩容
*
* */
import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02()  {
    }
    public void init(){
//        初始化的一些基本操作:
        Container container = this.getContentPane();
        this.setVisible(true);
        container.setBackground(Color.yellow);
        setBounds(100,100,500,350);


//        新建列表框：
//        String arr1[]={"1","12","123","1234"};//列表的内容：
//        JList objectJList = new JList(arr1);
//        列表的内容也可以别写死，而是动态扩容：
        Vector  vector = new Vector();
        JList objectJList = new JList(vector);
        vector.add("则卷千兵卫");
        vector.add("则卷阿拉蕾");
        vector.add("山吹见取");
        vector.add("龟仙人");
        vector.add("布尔玛");
        vector.add("天津饭");//随时可以增减（动态扩容）


        container.add(objectJList);
    }

    public static void main(String[] args) {
        new TestComboboxDemo02().init();

    }
}
