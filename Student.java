/* Assignment program of student
 abstract class Student
 {
	 String name;
	 int sid;
	 
	 
	 // create suitable constructors
	 
	public final void attendclass()
	{
		System.out.println("gain knoweledge");
	}
	protected void bunk class();  //cte make this method as abstract and use public are protected in the sub-class

*/

abstract class Student
 {
	 String name;
	 int sid;
	 
	 // create suitable constructors
	 Student()
	 {
	 }
	 Student(String name, int sid)
	 {
		 this.name=name;
		 this.sid=sid;
	 }
	  public final void attendclass()
	{
		System.out.println("gain knoweledge");
	}
	abstract protected void bunkclass();
 }
 class Stu1 extends Student
 {
	 Stu(String name, int sid)
	 {
		 super(name,sid);
	 }
	 public void  bunkclass()
	 {
		 System.out.println("lose knoweledge");
	 }
 } 
class Driver3
{
   public static void main(String[] args)
	{
         Student s1=new Stu1("niki",123);
		 s1.bunkclass();
		 s1.attendclass();
}
}