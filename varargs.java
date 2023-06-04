class A
{
	void add(int ... a)
		{
			int sum =0;
			for(int x:a)
			{
				sum+=x;
			}
			System.out.println(sum);
		}
}
class varargs
{
	public static void main(String[] args)
	{
		A r=new A();
		r.add();
		r.add(10);
		r.add(10,20);
		r.add(10,20,30);
		r.add(10,20,30,40);
	}
}