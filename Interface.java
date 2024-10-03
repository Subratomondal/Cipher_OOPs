// interface shape{
//     double pi =3.14;
//     double getSquare(double r);

// }

// class Circle implements shape{
//     public double  getSquare(double r){
//         return r*r;
//     }
//     void fun(){
//         System.out.println("Hey, I implemented shape named circle");
//     }
    
// }


// public class Interface {
//     public static void main(String[] args)
//     {
//             Circle c1 = new Circle();
//             c1.fun();
//             System.out.println(c1.getSquare(4));
//     }
    
// }

interface AB{
    int x = 20;
    void fun();

}

interface BC{
    int x =10;
    void fun();
}

class CD implements AB,BC{
    public void fun(){
        System.out.println("hey am in class C");
    }
}
interface DE extends AB,BC{
    
}
public class Interface {
    public static void main(String[] args)
    {
        CD c = new CD();
        c.fun();
        System.out.println(AB.x);
        System.out.println(BC.x);

            
    
}
}