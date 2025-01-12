package methodoverriding;

public class Child extends Parent{

	public static void main(String[] args) {
	 Child obj=new Child ();
			 obj.method();
	}
public void method()
{
	System.out.println("Method of child class");
	super.method();
}
}
