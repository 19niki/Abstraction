//abstract class and method example and how to use members of the abstract class.

abstract class Student
{
	static int i;
	abstract void sports();
	void college()
	{
		System.out.println("Dr. AIT");
	}
}
class Stu1 extends Student
{
	void sports()
	{
		System.out.println(i);
		System.out.println("run");
	}
}
class Stu2 extends Student
{
	void sports()
	{
		System.out.println("swim");
	}
}
class Cstu extends Stu1
{
     
}
class Driver1
{
	public static void main(String args[])
	{
		Student s1=new Stu1();
		Student s2=new Stu2();
		Stu1 s3=new Cstu(); 
		s2.sports();
		s1.college();
		s2.college();
		s1.sports();
		s3.sports();
	}
}

