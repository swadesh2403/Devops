interface A
{
	public void funcA();
}
interface B extends A			//extends interface
{
	public void funcB();
}
class C implements B
{
	public void funcA()
	{
		System.out.println("Function A");
	}
	public void funcB()
	{
		System.out.println("Function B");
	}
	public static void main(String[] args)
	{
		C c1=new C();
		c1.funcA();
		c1.funcB();
	}
}