/* can we overload final method
*/
class P4 
{
	final  int add(int a, int b)
	{
		return a+b;
	}
	final  int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args)
	{
		P4 obj=new P4();
       System.out.println(obj.add(10,50));
	   //add(78,89,56);
	}
}
