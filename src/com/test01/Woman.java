package com.test01;

public class Woman {
   
   void classWork() {
      System.out.println("출석카드 찍기"); //ccc(cross cutting concern)
      
      try {
         System.out.println("컴퓨터를 켜서 인스타를 한다."); //cc(Core Concern)
      }catch (Exception e) {
         System.out.println("쉬는 날이다.");//ccc
      }finally {
         System.out.println("강의장을 나간다.");//ccc//남자와도 겹치키 때문에
      }
   }

}