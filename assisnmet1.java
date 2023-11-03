import java.util.*;
class assisnmet1
{
int real,img;
assisnmet1()
{
this.real=0;
this.img=0;
}
assisnmet1(int x,int y)
{this.real=x;
this.img=y;
}

public static void main(String [] args)
{
assisnmet1 c1=new assisnmet1(10,2);
assisnmet1 c2= new assisnmet1(2,10);
System.out.println("First no =\t"+c1.real+"+"+c1.img+"i");
int a,b;
a=c1.real+c2.real;
b=c1.img+c2.img;
System.out.println("Sum =\t"+a+"+"+b+"i");

a=c1.real-c2.real;
b=c1.img-c2.img;
System.out.println("Sub =\t"+a+"+"+b+"i");

a=c1.real*c2.real;
b=c1.img*c2.img;
System.out.println("mul =\t"+a+"+"+b+"i");

a=c1.real/c2.real;
b=c1.img/c2.img;
System.out.println("Sdiv =\t"+a+"+"+b+"i");



}
}