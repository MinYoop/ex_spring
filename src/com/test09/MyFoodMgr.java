package com.test09;

public class MyFoodMgr {
   
   private Food favoriteFood;
   private Food unfavoriteFood;
   
   
   
   
   public MyFoodMgr() {
	super();
}


public MyFoodMgr(Food unfavoriteFood) {
      favoriteFood =new Food();
      favoriteFood.setName("치킨");
      favoriteFood.setPrice(10000);
      
      this.unfavoriteFood=unfavoriteFood;
   }


   /*public MyFoodMgr(Food favoriteFood, Food unfavoriteFood) {
      super();
      this.favoriteFood = favoriteFood;
      this.unfavoriteFood = unfavoriteFood;
   }
*/

   public Food getFavoriteFood() {
      return favoriteFood;
   }


   public void setFavoriteFood(Food favoriteFood) {
      this.favoriteFood = favoriteFood;
   }


   public Food getUnfavoriteFood() {
      return unfavoriteFood;
   }


   public void setUnfavoriteFood(Food unfavoriteFood) {
      this.unfavoriteFood = unfavoriteFood;
   }


   @Override
   public String toString() {
      return "MtFoodMgr [favoriteFood=" + favoriteFood + ", unfavoriteFood=" + unfavoriteFood + "]";
   }
   
   
   
   
}
