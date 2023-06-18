package com.kuang.snake;

//import com.kuang.lesson04.ImageIconDemo;//ImageIcon部分可以参考这个类，进行理解

import javax.swing.*;
import java.net.URL;

/*数据中心：管理图片的数据
 *
 *
 * */
public class Data {

 //URL url = ImageIconDemo.class.getResource("D8DB]~QJ1507~LBIA7`_A6S.png");
// 这是相对路径，下面我们来写绝对路径：在前面加上“/”.相当于当前的项目
// public  static URL headerURL=Data.class.getResource("/statics/header.png");//如果static文件夹是在根目录src下，而不是Data文件夹下，就可以这么写
 public  static URL headerURL=Data.class.getResource("statics/header.png");
 //    有了地址，把图片地址 变为图标：
 public static  ImageIcon  header = new ImageIcon(headerURL);




 public  static URL upURL=Data.class.getResource("statics/up.png");
 public  static URL downURL=Data.class.getResource("statics/down.png");
 public  static URL leftURL=Data.class.getResource("statics/left.png");
 public  static URL rightURL=Data.class.getResource("statics/right.png");
 public  static URL bodyURL=Data.class.getResource("statics/body.png");
 public  static URL foodURL=Data.class.getResource("statics/food.png");

 //    有了地址，把图片地址 变为图标：
 public static  ImageIcon  up = new ImageIcon(upURL);
 public static  ImageIcon  down = new ImageIcon(downURL);
 public static  ImageIcon  left = new ImageIcon(leftURL);
 public static  ImageIcon  right = new ImageIcon(rightURL);
 public static  ImageIcon   body= new ImageIcon(bodyURL);
 public static  ImageIcon   food= new ImageIcon(foodURL);



}
