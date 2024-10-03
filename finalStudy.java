class abc{
    final int value1 = 23; //Final variable - Value once assigned cannot be changed
    final int value2;
    //Either assign value at time of declaration or assign the value inside constructors
    abc()
    {
        value2=34;
    }
    final void fun(){
        System.out.println("I'am a function in class A");
    }

}
final class bcd extends abc // Final class cannot be inherited
{
    // void fun(){
    //     System.out.println("I'am a function in B overriding function in A");
    // }

}
// class cde extends bcd{

// }

public class finalStudy {
    public static void main(String[] args){

    }
    
}
