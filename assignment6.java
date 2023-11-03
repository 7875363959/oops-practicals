
import java.util.Scanner;

public class assignment6
{
  int num1,num2,div;

  Scanner sc=new Scanner(System.in);

  public void divByZero()
  {
   System.out.println("Enter First Number :");
   num1=Integer.parseInt(sc.next());

   System.out.println("Enter Second Number :");
   num2=Integer.parseInt(sc.next());

   div=num1/num2;

   System.out.println ("Result: " + div);
  }

  public void arrayIndexOutOfBound()
  {
    int n;

    System.out.println("Enter Array Size :");
    n=sc.nextInt();

    int a[]=new int[n];

    for(int i=0;i<=n;i++)
    {
      System.out.println("Enter Element"+i+" :");
      a[i]=sc.nextInt();
    }
  }


   public static void main(String[] args) {

  assignment6 d=new assignment6();

try
      {
        d.divByZero();
        d.arrayIndexOutOfBound();
      }

      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Array index out of bound exception occurred");
      }
      catch (NumberFormatException e)
      {
        System.out.println("Number format exception occurred");
      }
      catch (ArithmeticException e)
      {
        System.out.println("Arithmatic exception occurred");
      }
      catch (Exception e)
      {
        System.out.println("Exception occurred");
      }

        System.out.println("Out of try-catch block...");
    }
}
