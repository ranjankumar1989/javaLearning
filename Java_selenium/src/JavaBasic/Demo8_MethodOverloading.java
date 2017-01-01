package JavaBasic;

public class Demo8_MethodOverloading 
{
	public static void main(String args[])
	{
		mother m1  = new mother();
			m1.sharee();
		
		Daughter m2  = new Daughter();
				m2.sharee();
		
		mother m3 = new Daughter();
		m3.sharee();
	}

}

class mother
{
	void sharee()
	{
		System.out.println("Simple Saree");
	}

}

class Daughter extends mother
{
	void sharee()
	{
		System.out.println("**** jatre Design*******");
	}
}


