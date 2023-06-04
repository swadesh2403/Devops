class Display
{
	Display()				//Non-paramaterized Constructor
	{
		System.out.println("Constructor Called !!");
	}
	Display(int a)			//Parametrized Constructor
	{
		System.out.println("Value of A : "+a);
	}
}
public class Construtor
{
	public static void main(String[] args)
	{
		Display obj=new Display();
		Display obj1=new Display(12);
	}
}