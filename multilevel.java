import java.util.Scanner;
class addition
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	void add()
	{
		int c=a+b;
		System.out.println("Sum: "+c);
	}
}
class subtraction extends addition
{
	void sub()
	{
		int d=a-b;
		System.out.println("Sub: "+d);
	}
}
class multiplication extends subtraction
{
	void mult()
	{
		int e= a*b;
		System.out.println("Product: "+e);
	}
}
public class multilevel
{
	public static void main(String[] args)
	{
		System.out.println("Enter the numbers:");
		multiplication z1=new multiplication();
		z1.add();
		z1.sub();
		z1.mult();
	}
}
			