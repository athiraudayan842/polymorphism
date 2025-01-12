package methodoverriding;

public class Child1 extends Parent1 {

	public static void main(String[] args) {
Child1 obj=new Child1();
obj.method(2,3);
	}
public void method(int a,int b)
{
	System.out.println(a+b);
	super.method(5,6);
}
}
