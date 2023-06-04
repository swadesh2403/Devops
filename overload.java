class overload
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		System.out.println( a+b);
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		add(5,2);
		
	}
}