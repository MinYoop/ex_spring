package com.test09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

   public static void main(String[] args) {
      
      ApplicationContext factory =new ClassPathXmlApplicationContext("com/test09/beans.xml");
      
      MyFoodMgr myFood=(MyFoodMgr) factory.getBean("MyFood");
      System.out.println(myFood);
   
   }
}