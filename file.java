
import java .util.*;
import java.io.*;
public class file
 {
	 Scanner sc=new Scanner(System.in);
 void add ()throws IOException
 {
	 int roll;
	 String name;
	 PrintWriter p= new PrintWriter(new BufferedWriter(new FileWriter("student.txt",true)));

	 System.out.println("enter a roll :");
	 roll=sc.nextInt();
	 	 System.out.println("Enter your name");
	 name=sc.next();

	 p.println(roll);
	 p.println(name);
      p.close();
 }


 void display()throws IOException
 { try{
	 BufferedReader b=new BufferedReader(new FileReader("student.txt"));
	 String s;
	 while((s=b.readLine())!=null)
	 {
		 System.out.println("ROLL NO :"+s);
		 System.out.println("NAME :"+b.readLine());
	 }
		 b.close();
}catch(FileNotFoundException e)
{
	System.out.println("File  not found Exception");
	}


	 }

 void search () throws IOException
 {
	 BufferedReader b= new BufferedReader(new FileReader("student.txt"));
	 String s;
	 int n;
	 System.out.println("Enter a roll no to search");
	 n=sc.nextInt();
	 while((s=b.readLine())!=null)
	 {
		 if(Integer.parseInt(s)==n)
		 {System.out.println("ROLL :"+s);
		 System.out.println("NAME : "+b.readLine());
		 }else
		 {
			 for(int i=0;i<1;i++)
			 {
				 b.readLine();
			 }

		 }

	 }



 }
 void modify() throws IOException
 {
	 File f=new File("student.txt");
	 File f1=new File("studenttemp.txt");
	 BufferedReader b= new BufferedReader(new FileReader(f));
	 PrintWriter p=new PrintWriter( new BufferedWriter(new FileWriter(f1,true)));
	 String s,name;
	 int roll;
	 System.out.println("Enter a roll no to modify :");
	 int n=sc.nextInt();
	 while((s=b.readLine())!=null)
	 {
		 if((Integer.parseInt(s))==n)
		 {
			 System.out.println("Enter your name");
			 name=sc.next();
			 System.out.println("enter a roll :");
			 roll=sc.nextInt();
			 p.println(s);
			 p.println(name);
			 for(int i=0;i<1;i++)
			 {
				 b.readLine();}

		 }
		 else
		 {
			 p.println(s);
			 p.println(b.readLine());
		 }
	 }
	 b.close();
	 p.close();
	 boolean x=f.delete();

	 if(x)
	 {System.out.println("File is deleted . ");}
	 if(f1.renameTo(f))
	 {
		 System.out.println("file rename .");}
 }


 void delete() throws IOException
  {
 	 File f=new File("student.txt");
 	 File f1=new File("studenttemp.txt");
 	 BufferedReader b= new BufferedReader(new FileReader(f));
 	 PrintWriter p=new PrintWriter( new BufferedWriter(new FileWriter(f1,true)));
 	 String s,name;
 	 int roll;
 	 System.out.println("Enter a roll no to detele :");
 	 int n=sc.nextInt();
 	 while((s=b.readLine())!=null)
 	 {
 		 if((Integer.parseInt(s))==n)
 		 {
 			 System.out.println("Name : "+s);
 			 System.out.println("Roll : "+b.readLine());

 		 }
 		 else
 		 {
 			 p.println(s);
 			 p.println(b.readLine());
 		 }
 	 }
 	 b.close();
 	 p.close();
 	 boolean x=f.delete();

 	 if(x)
 	 {System.out.println("File is deleted . ");}
 	 if(f1.renameTo(f))
 	 {
 		 System.out.println("file rename .");}
  }


 void cleared()throws IOException
 {
	 try{
	 PrintWriter p =new PrintWriter(new BufferedWriter(new FileWriter("student.txt")));
	 p.close();
	  System.out.println("all cleared !!! ");
 }
 catch(IOException e)
	 {
		 System.out.println("File Not found ");
		 }

}




 public static void main(String[] args)
 {
	try{ int ch;
	 Scanner s=new Scanner(System.in);
	 file f=new file();
 do
 {
 System.out.println("\n 1.Add data \n2.Display\n3.Search \n4.Modify\n5.Clear \n6.Delete \n Enter your choice");
 ch=s.nextInt();
 switch(ch)
 {
	 case 1: f.add();break;
	 case 2: f.display();break;
	 case 3:f.search();break;
	 case 4:f.modify();break;
	 case 5:f.cleared();break;
	 case 6:f.delete();break;
	 case 7:System.exit(0);
	 default:System.out.println("Invalid choice");
	 }
 }while(ch!=7);
}
catch(Exception e)
{
	System.out.println("Exception");}
 }}
