package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

   public static void main(String[] args) {
      ApplicationContext app = new ClassPathXmlApplicationContext("com/test05/applicationcontext.xml");
      
      Person w = app.getBean("woman",Person.class);
      Person m = (Person) app.getBean("man");
      
      System.out.println("<여학생 입장>");
      w.classWork();
      System.out.println("--------------------");
      System.out.println("<남학생입장>");
      m.classWork();
   }
}