package JavaBasic;

public class Demo7_Static 
{
	public static void main(String[] args)
	{
	
		Bottle.size = 66;
		Bottle.n();
		
		Bottle B1 = new Bottle();
		B1.cost  = 10;
		B1.m();
		
	}
}

class Bottle
{
	int cost;
	static double size;


	void m()
	{
		System.out.println("This is an instanse variable");
	}

	static void n()
	{
		System.out.println("This is an static method");
	}
}



