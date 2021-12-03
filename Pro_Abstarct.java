/* What is abstraction? 
 *  It is a princple which help to provide only the essential features of object and hide their implemenation
 *  from user.
 *  Two types of Abstract methods
 *  1. Concetrte methods:
 *  
 *   A method which a body is called Concetrte method
 *   Ex: Class cal
 *   {
 *       int add(int a int b)
 *       { 
 *       return a+b;
 *       }
 *       
 *   2. Abstract methods:
 *   
 *   A method which does not have body is called Abstract method.  
 *   Method must be prefixed with the Abstract key - word.
 *   Method declaration must end with the (;) and must not have the body.  
 *   If the method is abstract then it is necessary to make the class abstract is well  
 *   (Pls check the Abstract example from Abstract 1 to 9)
 */ 


package Abstarct_Pro;

abstract public class Pro_Abstarct 
{
	abstract int add(int a, int b); //abstract method in the class so we should made the class as the abstract
	
	int sub(int a, int b) // a abstract class can have the Concrete methods also
	{
		return a-b;
	}
}
 class Pro extends Pro_Abstarct  //implementing the body to the abstract class in the sub class 
 {
	 int add(int a, int b)
	 {
		 return a+b;
	 }
 }
 