/*
 * What is abstract class and concrete class?
 * Any class which have the abstract methods is called as the abstract class it can have the concrete class also.
 * Any class which have only concrete methods are called as the concrete class
 * If Abstract class has the Abstract method then it is necessary to create the sub class for the abstract class and implement
 * the body to the abstract method in the sub class by overriding it.
 * (Pls check the Abstract example from Abstract 1 to 9)
 * 
*/
package Abstarct_Pro;

abstract public class Pro_Abstract2 
{
   
   abstract void speed(); // abstract method
   
   void details(int price, String color,int speed) //conectere method
   {
	   System.out.println("Price of the car is:"+ price);
	   System.out.println("Color of the car is:"+ color);
	   System.out.println("Speed of the car is:"+ speed);
	   
   }
}

 class Pro2 extends Pro_Abstract2
{
	 void speed() //implementing the abstarct method and overriding in the child class
	{
		System.out.println("\"Speed of the car is:\"+ speed");
	}
	 
	 void details(int price, String color,int speed) //conectere method
	   {
		   System.out.println("Price of the car of child 1 is:"+ price);
		   System.out.println("Color of the car of child 1 is:"+ color);
		   System.out.println("Speed of the car of child 1 is:"+ speed);
}
}
class Pro3 extends Pro_Abstract2
{
	 void speed() //implementing the abstarct method and overriding in the child class
	{
		System.out.println("\"Speed of the car is:\"+ speed");
	}
	 
	 void details(int price, String color,int speed) //conectere method
	   {
		   System.out.println("Price of the car of child 2 is:"+ price);
		   System.out.println("Color of the car of child 2 is:"+ color);
		   System.out.println("Speed of the car of child 2 is:"+ speed);
}
}
