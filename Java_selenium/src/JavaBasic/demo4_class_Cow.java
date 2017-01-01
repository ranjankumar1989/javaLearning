package JavaBasic;
public class demo4_class_Cow 
{

	public static void main(String[] args) 
	{

		System.out.println("Program started");
			
		cow c =new cow();
			c.name ="Tunga";
		cow r = new cow();
			r.name ="Ganga";
		
			c.walk();
			r.walk();
		System.out.println("Program Ended");
	}

}

class cow 
{
	String name;
	void walk()
	{
		System.out.println(name + " is walking");
	}
}