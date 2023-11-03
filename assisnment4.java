import java.util.*;
abstract class shape{
	Double height,width;
	Scanner s=new Scanner(System.in);
	shape()
	{
		System.out.println("Enter a height");
		this.height=s.nextDouble();
		System.out.println("Enter a width");
		this.width=s.nextDouble();
	}
	abstract double calculatearea();

}
class regtangle extends shape{
	double calculatearea(){

		System.out.println("For Rectanglre");
		return height*width;
	}
}
class tringale extends shape{
	double calculatearea(){


		System.out.println("For Tre");
		return (height*width)/2;
	}
}
class assisnment4
{
	public static void main(String[] args)
	{
		double area;
		regtangle r=new regtangle();
		area=r.calculatearea();
		System.out.println("Area of Rectangle=\t"+area);

		tringale t=new tringale();
		area=t.calculatearea();
		System.out.println("Area of Triangle=\t"+area);

		}
}