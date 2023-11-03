
import java.util.*;
	class employee{
	public	Scanner s=new Scanner(System.in);
		String name=null;
		String mail=null;
		int eid;
		int mobile_no;
		 public void input()
		 {
			 System.out.println("Enter a name");
			 this.name=s.nextLine();
			 System.out.println("Enter a EID");
			 this.eid=s.nextInt();
			 System.out.println("Enter a mail id");
			 this.mail=s.next();
			 System.out.println("Enter a mobile");
			 this.mobile_no=s.nextInt();

		 }
		 public void display()
		 {
			 System.out.println("Name :\t"+name);
			 System.out.println("Eid :\t"+eid);
			 System.out.println("MAIL :\t"+mail);
			 System.out.println("Mobile :\t"+mobile_no);


		 }
	}
		 class programmer extends employee{

			double bp,da,hra,pf,staff_clube, net,gross,deduct;

			 public void calculate()
			 {
				 System.out.println("Enter your basic pay");
			     this.bp=s.nextInt();
			     this. da=bp*0.97;
			     this. hra=bp*0.10;
			     this. pf=bp*0.12;
			     this.staff_clube=bp*0.001;
			     this.gross=bp+da+hra;
			     this.deduct=pf+staff_clube;
			     this.net=gross-deduct;
			     this.salaryslip();


			 }
			 public void salaryslip()
			 {
				 System.out.println("********************PRAGRAMMER SALARY SLIP*******************************");
				 this.display();
				 System.out.println("Basic pay :\t"+bp);
				 System.out.println("Da :\t"+da);
				 System.out.println("Hrf :\t"+hra);
				 System.out.println("pf :\t"+pf);
				 System.out.println("Gross :\t"+gross);
				 System.out.println("Net salary :\t"+net);
				 System.out.println("Deduct :\t"+deduct+"\n\n");

			 }

		 }

		 class Aprojectmanager extends employee{

				double bp,da,hra,pf,staff_clube, net,gross,deduct;

				 public void calculate()
				 {
					 System.out.println("Enter your basic pay");
				     this.bp=s.nextInt();
				     this. da=bp*0.97;
				     this. hra=bp*0.10;
				     this. pf=bp*0.12;
				     this.staff_clube=bp*0.001;
				     this.gross=bp+da+hra;
				     this.deduct=pf+staff_clube;
				     this.net=gross-deduct;
				     this.salaryslip();


				 }
				 public void salaryslip()
				 {
					 System.out.println("********************A manager SALARY SLIP*******************************");
					 this.display();
					 System.out.println("Basic pay :\t"+bp);
					 System.out.println("Da :\t"+da);
					 System.out.println("Hrf :\t"+hra);
					 System.out.println("pf :\t"+pf);
					 System.out.println("Gross :\t"+gross);
					 System.out.println("Net salary :\t"+net);
					 System.out.println("Deduct :\t"+deduct);

				 }

			 }
		 class pmanager extends employee{

				double bp,da,hra,pf,staff_clube, net,gross,deduct;

				 public void calculate()
				 {
					 System.out.println("Enter your basic pay");
				     this.bp=s.nextInt();
				     this. da=bp*0.97;
				     this. hra=bp*0.10;
				     this. pf=bp*0.12;
				     this.staff_clube=bp*0.001;
				     this.gross=bp+da+hra;
				     this.deduct=pf+staff_clube;
				     this.net=gross-deduct;
				     this.salaryslip();


				 }
				 public void salaryslip()
				 {
					 System.out.println("********************PROJECT M SALARY SLIP*******************************");
					 this.display();
					 System.out.println("Basic pay :\t"+bp);
					 System.out.println("Da :\t"+da);
					 System.out.println("Hrf :\t"+hra);
					 System.out.println("pf :\t"+pf);
					 System.out.println("Gross :\t"+gross);
					 System.out.println("Net salary :\t"+net);
					 System.out.println("Deduct :\t"+deduct);

				 }

			 }
		 class teaml extends employee{

				double bp,da,hra,pf,staff_clube, net,gross,deduct;

				 public void calculate()
				 {
					 System.out.println("Enter your basic pay");
				     this.bp=s.nextInt();
				     this. da=bp*0.97;
				     this. hra=bp*0.10;
				     this. pf=bp*0.12;
				     this.staff_clube=bp*0.001;
				     this.gross=bp+da+hra;
				     this.deduct=pf+staff_clube;
				     this.net=gross-deduct;
				     this.salaryslip();


				 }
				 public void salaryslip()
				 {
					 System.out.println("********************TEAM LIED SALARY SLIP*******************************");
					 this.display();
					 System.out.println("Basic pay :\t"+bp);
					 System.out.println("Da :\t"+da);
					 System.out.println("Hrf :\t"+hra);
					 System.out.println("pf :\t"+pf);
					 System.out.println("Gross :\t"+gross);
					 System.out.println("Net salary :\t"+net);
					 System.out.println("Deduct :\t"+deduct);

				 }

			 }



public class assisnment3
 {

public static void main (String []args)
{
	Scanner s1=new Scanner(System.in);
	int x=0;
do {
		System.out.println("1.Programmer\n2.project manager\n3.assist manager\n4.team lead \n5.exit\n Enter a choice");
		x=s1.nextInt();
		switch(x)
		{
		case 1: programmer p=new programmer();
		         p.input();
		         p.calculate();
		         p.salaryslip();break;
		case 2: pmanager p1=new pmanager();
		p1.input();
        p1.calculate();
        p1.salaryslip();break;
		case 3: Aprojectmanager p2=new Aprojectmanager();
		p2.input();
        p2.calculate();
        p2.salaryslip();break;
		case 4:teaml p3=new teaml();
		p3.input();
        p3.calculate();
        p3.salaryslip();break;
        default:System.out.println("Invalid choice");
		}


}while(x!=5);


}
}
