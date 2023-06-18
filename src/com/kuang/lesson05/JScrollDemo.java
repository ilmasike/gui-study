package com.kuang.lesson05;
/*若遇到一个较小的容器窗体中显示一个较大部分内容的情况，可用JScrollPane面板。这是一个带滚
动条的面板，就像平时浏览网页，经常遇到的滚动条一样（窗口大了可能看不到，但是小窗口肯定可以）。
*/
import javax.swing.*;
import java.awt.*;

public class JScrollDemo  extends JFrame {
    public JScrollDemo() {
    }

    public void init(){
        Container container = this.getContentPane();
//        container.setLayout(new GridLayout(2,1,10,10));//设置表格布局：后面两个参数是上下间距
        setVisible(true);
        this.setBounds(300,300,700,400);
        container.setBackground(Color.red);


        //        文本域：JTextArea
        JTextArea jTextArea = new JTextArea("我是文本域",20,50);
        jTextArea.setText("我是默认的文本域文字！！");
//        把文本域放到面板上：
        JScrollPane jscrollPanel = new JScrollPane(jTextArea);

        container.add(jscrollPanel);





    }

//    把JFrame的常用设置，封装为一个类
    public void usual_Frame(Container s){
    }

    public static void main(String[] args) {
        new JScrollDemo().init();

    }
}
