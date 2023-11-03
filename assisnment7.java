import java.util.*;
class assisnment7{
	void _integer(){
		ArrayList<Integer>obj=new  ArrayList<Integer>();
		int c=0,ch,o;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no How many no You want to store");
		int no=s1.nextInt();
		System.out.println("Enter a Array elements "+no+" : ");
		for(int i=0;i<no;i++){

               obj.add(s1.nextInt());
		}
		System.out.println("\n\nArray elements are :"+obj);
		o=obj.size();
		do{
			System.out.println("1.Even or odd Number \n 2.Prime Number \n 3.Exit");
			ch=s1.nextInt();
            switch(ch){
				case 1:for(int a:obj){
					if(a%2==0)
					{ System.out.println(a+" is even ");
						c++;
						}else{
							System.out.println(a+" is odd ");

							}

					}System.out.println("Total Event no = "+c);
								System.out.println("Total odd no = "+(o-c));
								break;

                  case 2:int c1=0;for(int a:obj){
					  for(int i=2;i<=a;i++){
					if(a%i==0)
					{
						c1++;
						}
}
						if(c1==1){
							System.out.println(a+" Prime number");
							}else{
								System.out.println(a+" is not a Prime number");

								}
					}
					break;
				}
			}while(ch==3);
	}


		void _string()
		{ArrayList<String>obj=new  ArrayList<String>();
		Scanner s1=new Scanner(System.in);
			System.out.println("Enter no How many no You want to store");
		int no=s1.nextInt();
		System.out.println("Enter a elements : ");
				for(int i=0;i<=no-1;i++){

		               obj.add(s1.next());
		}
		System.out.println("String array elements = "+obj);

		for(String a:obj)
		{ StringBuffer s11=new StringBuffer(a);
			if(a.equals(s11.reverse().toString()))
			{
              System.out.println(a+" is Palimdrom String");
			}else{System.out.println(a+" is not a Palimdrom String");
			}
}
}



	public static void main(String []args){
		int ch;
		assisnment7 a=new assisnment7();
		Scanner s=new Scanner(System.in);
		do{
			System.out.println("1.Integer \n 2.String\n 3.Exit");
			ch=s.nextInt();
			System.out.println("Enter your choice : ");
			switch(ch)
			{
				case 1:a. _integer();break;
				case 2:a._string();break;
				default:System.out.println("Invaild choice ");

				}
			}while(ch==3);
		}
}