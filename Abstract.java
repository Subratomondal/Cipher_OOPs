abstract class car{
    int maxSpeed;

   abstract public void accelerate();
   abstract public void brake();

}
abstract class BMW extends car{
    public void accelerate(){
        System.out.println("Car can accelerate");
    }

}
class BMW2 extends BMW{
    public void brake(){
        System.out.println("BMW is applying a break");

    }
}



public class Abstract {
    public static void main(String[] args){
        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();

    }
}
