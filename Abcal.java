 abstract class Cal 
{
	Cal()
	{
	}
   abstract int add(int a, int b);	
}

abstract class Abcal extends cal
{
	public static void main(String[] args)
	{
     Cal obj =new Abcal();
	}
}