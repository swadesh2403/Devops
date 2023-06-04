import java.util.Scanner;
public class inputdata
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		var num1=s.nextInt();
		var num2=s.nextInt();
		System.out.println("Sum: "+(num1+num2));
		System.out.println("Sub: "+(num1-num2));
		System.out.println("Product: "+(num1*num2));
		System.out.println("Quotient: "+(num1/num2));	
	}
}