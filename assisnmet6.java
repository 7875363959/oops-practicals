import java.util.*;
interface vehicle {

	void changeGear(int g);
	void speedUp(int i);
	void applyBrakes(int d);

}
 class bike implements vehicle
{
  int speed,gear;

  public void changeGear(int g)
  {
    this.gear=g;
  }
  public void speedUp(int i)
  {
    speed=speed+i;
  }
  public void applyBrakes(int d)
  {
    speed=speed-d;
  }
  public void statusDisplay()
  {
    System.out.println("Gear:"+gear+"	Speed:"+speed);
  }
}


  class car implements vehicle
 {
   int speed,gear;
   public void changeGear(int g)
   {
     gear=g;
   }
   public void speedUp(int i)
   {
     speed=speed+i;
   }
   public void applyBrakes(int d)
   {
     speed=speed-d;
   }
 public void statusDisplay()
   {
     System.out.println("Gear:"+gear+"	Speed:"+speed);
   }
}


class bicycle implements vehicle
{
  int speed;
  int gear;
  public void changeGear(int g)
  {
    gear=g;
  }
  public void speedUp(int i)
  {
    speed=speed+i;
  }
  public void applyBrakes(int d)
  {
    speed=speed-d;
  }

  public void statusDisplay()
  {
    System.out.println("Gear:"+gear+"	Speed :"+speed);
  }
}

	public class assisnmet6
	{
	  public static void main(String[] args)
	  {
		bicycle b=new bicycle();
		b.changeGear(3);
		b.speedUp(2);
		b.applyBrakes(1);
		System.out.println("Bicycle State :");
		b.statusDisplay();

		bike bk=new bike();
		bk.changeGear(4);
		bk.speedUp(3);
		bk.applyBrakes(2);
		System.out.println("Bike State :");
		bk.statusDisplay();

		car c=new car();
		c.changeGear(5);
		c.speedUp(3);
		c.applyBrakes(1);
		System.out.println("Car State :");
		c.statusDisplay();
	  }
	}

