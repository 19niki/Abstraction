// example for the abstract class
abstract class Laptop
{
	String name;
	int price;
	Laptop()
	{
	}
	Laptop(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	abstract void laptopdetails();
}

class Lap1 extends Laptop
{
	Lap1(String name, int price)
	{
		super(name,price);
	}
	void laptopdetails()
	{
		System.out.println("name is:"+name);
		System.out.println("price is:"+price);
	}
}
class Driver2
{
	public static void main(String[] args)
	{
		Laptop L1=new Lap1("dell",123445);
		L1.laptopdetails();
	}
}

