import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Main m1= new Main();
        Line l1=new Line(m1.getPoint(),m1.getPoint());
        l1.calculateLength();
        Line l2=new Line(m1.getPoint(),m1.getPoint());
        l2.calculateLength();
        if(l1.length>l2.length){
            System.out.println("Line 1 is greater than Line 2");
        } else if (l1.length<l2.length) {
            System.out.println("Line 1 is smaller than Line 2");
        } else{
            System.out.println("Line 1 and Line 2 are equal");
        }
    }
    public Point getPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate: ");
        double x= sc.nextDouble();
        System.out.println("Enter y coordinate: ");
        double y= sc.nextDouble();
        return new Point(x, y);
    }
}
