package com.test01;

public class Man {

   void classWork() {
      System.out.println("출석카드 찍기");
      
      try {
         System.out.println("컴퓨터를 켜서 축구를 본다.");
      }catch (Exception e) {
         System.out.println("쉬는 날이다.");
      }finally {
         System.out.println("강의장을 나간다.");
      }
   }

}