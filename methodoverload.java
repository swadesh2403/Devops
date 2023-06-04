class Multiply
{
	public int Product(int a,int b)
	{
		return a*b;
	}
	public int Product(int x,int y,int z)
	{
		return x*y*z;
	}
}
public class methodoverload
{
	public static void main(String[] args)
	{
		Multiply m=new Multiply();
		System.out.println("Product :"+Product(1,2,3));
		System.out.println("Product :"+Product(1,2));
	}
}
