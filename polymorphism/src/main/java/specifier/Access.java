package specifier;

public class Access {

	public static void main(String[] args) {
		Access obj=new Access();
		obj.def();
		obj.priv();
		obj.prot();
		obj.pub();

	}
private void priv()
{
	System.out.println("Method of Private");
}
 void def()
{
	System.out.println("Method of default");
}
 protected void prot()
 {
	 System.out.println("Method of protected");
	 
 }
 public void pub()
 {
	 System.out.println("Method of public");
 }
 }

