class A{
    private int a =5;
    private int b = 26;
    private int c = 34;

    public int getA(){
        return this.a ;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public void setA(int a){
        if(a>100){
            this.a = a;
            System.out.println("a Changed its value to "+a);
        }
        else{
            System.out.println("Value will not changed");
        }

    }
}


public class Encapsulation {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.getA());
        System.out.println(a.getB());
        System.out.println(a.getC());
        a.setA(100);
        System.out.println(a.getA());
    }
    
}
