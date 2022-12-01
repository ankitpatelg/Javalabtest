

public class Inheritence {
	
	public void display()
	{
		System.out.println("This is a Parent Class");
	}

}

class B extends Inheritence{

	public void display()
	{
		super.display();
		System.out.println("This is a Child Class");
	}
}
