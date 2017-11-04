package elecboard;
/*
 class Blip {
 private int blipvert(int x) { return 0; }


}
 class Vert extends Blip {
 // insert code here
    private int blipvert(int x) { return 0; }
 }
*/
/*
import java.util.*;

abstract class Vehicle { public int speed() { return 0; }}
class Car extends Vehicle { public int speed() { return 60; }}
class RaceCar extends Car { public int speed() { return 150; }}

public class a
{
    public static void main(String[] args)
    {
      // Blip b=new Blip();
       //Vert v= new Vert();
        
RaceCar racer = new RaceCar();
Car car = new RaceCar();
Vehicle vehicle = new RaceCar();

//System.out.println();
System.out.println(racer.speed()
        + ", " +car.speed() + ", " + vehicle.speed());
    }
}*/

class Building { }

public class Barn extends Building {

    public static void main(String[] args) {
Building build1 = new Building();
Barn barn1 = new Barn();
Barn barn2;
 Building build2=new Barn();
 barn2 = (Barn) build2;
 Object obj1 = (Object) build1;
 //String str1 = (String) build1;
// Building build2 = (Building) barn1;
}
}
