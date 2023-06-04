class overload
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		int num1=add(3,2);
		System.out.println(num1);
	}
}