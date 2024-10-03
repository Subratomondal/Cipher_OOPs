// class A{
//     public A(){
//         System.out.println("in A");
//     }
//     public A(int n){
//         System.out.println("in A int");
//     }

// }

// class B extends A{
//     public B(){
//         super();
//         System.out.println("in B");
//     }
//     public B(int n){
//         this();
//         System.out.println("in B int");
//     }

// }

// public class Super{
//     public static void main(String[] args){
//         B b = new B(5);

//     }
    
// }


class Loan{
    int rate;
    Loan(){
        System.out.println("am default constructor ");
    }
    Loan(int rate){
        this.rate = rate;

    }
    void printRate(){
        System.out.println(this.rate);
    }

}
class carloan extends Loan{
    int rate;
    carloan(){
        System.out.println("am default constructor");
        //System.out.println(super.rate); 
    }
    carloan(int rate){
        super(7); //to invoke the constructor of parent class 
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
        super.printRate();// using super to invoke methods of the parent class
        System.out.println(super.rate);// using super to access instance variable of parant class
    }
}

public class Super{
    public static void main(String[] args){
        carloan c1 = new carloan(8);
        c1.printRate();
    }
}