
import java.util.*;
import java.lang.*;
class publication{
	String tittle;
	float price;
	int copies;
	publication(String t,int c,float p)
	{
		this.tittle=t;
		this.price=p;
		this.copies=c;
	}

	public void sellcopies(int qty)
	{
		System.out.println("Total sell of publication =\t"+(price*qty));
	}
}


class Book extends publication{
	String author;
	Book(String t,int c,float p,String a)
	{
		super(t,c,p);
		this.author=a;
	}
	public void ordercopies()
	{
	}

	public void sellcopies(int qty)
	{
		System.out.println("Total sell of Book =\t"+(price*qty));
	}
}



class magzine extends publication{
	String currentissue;
	int orderqty;
	magzine(String t,int c,float p,String cs,int oqty)
	{
		super(t,c,p);
		this.currentissue=cs;
		this.orderqty=oqty;
	}
	public void receiveissue()
	{
		System.out.println(currentissue);
		System.out.println("order quanty ="+orderqty);
	}

	public void sellcopies(int qty)
	{
		System.out.println("Total sell of magzine =\t"+(price*qty));
	}

}

	public class assisnment2
	{
		public static void main(String [] args)
		{
			publication p=new publication("abc",2,100);
			System.out.println("#########################################");
			p.sellcopies(5);
			Book b=new Book("pqr",5,100,"anil");
			b.sellcopies(4);
			magzine m=new magzine("xyz",3,100,"not in stock",10);
			m.sellcopies(3);
			System.out.println("#########################################");
		}
	}
