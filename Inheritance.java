class shape{
    double pi = 3.14;
    double getSquare(double r)
    {
        return r*r;
    }
}
class circle extends shape{
    void area(double r){
        System.out.println(pi*getSquare(r));
    }
}
class cylinder extends shape{
    void volume(double r , double h){
        System.out.println(pi*getSquare(r)*h);
    }
}

public class Inheritance {
    public static void main(String[] args){
        circle c = new circle();
        c.area(5);
        cylinder cy=new cylinder();
        cy.volume(12.5,7.8);
    }
    
}
