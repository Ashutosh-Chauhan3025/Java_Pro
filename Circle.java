import java.util.*;
public class Circle {
    private double radius;
    public void setradius(double r){
        this.radius=r;
    }
    public int getradius(){
        return radius;
    }
    public double calculateArea(){
        return (3.141*radius*radius);
    }
    public double calculatePerimeter(){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double radius=scan.nextDouble();
        Circle s1=new Circle();
        s1.setradius(radius);
        System.out.println(s1.calculateArea());
        System.out.println(s1.calculatePerimeter());
    }
}
