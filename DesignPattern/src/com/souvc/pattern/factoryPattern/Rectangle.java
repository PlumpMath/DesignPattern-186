package com.souvc.pattern.factoryPattern;

/**
 * 类名: Rectangle.java</br> 
 * 包名：  com.souvc.pattern.factoryPattern </br> 
 * 描述: 创建  矩形  实体类并且实现Shape接口 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}