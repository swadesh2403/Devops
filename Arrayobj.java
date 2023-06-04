class Rectangle
{
	int length,breadth;
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
		
	public void display()
	{
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
	}
}
public class Arrayobj
{
	public static void main(String[] args)
	{
		Rectangle[] r=new Rectangle[3];
		r[0]=new Rectangle(10,12);
		r[1]=new Rectangle(1,2);
		r[2]=new Rectangle(2,22);
		System.out.println("Obj 1 ");
		r[0].display();
		System.out.println("Obj 2 ");
		r[1].display();
		System.out.println("Obj 3 ");
		r[2].display();
	}
}
		
			