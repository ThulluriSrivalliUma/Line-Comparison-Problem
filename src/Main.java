import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinate of the first Line : (x1 y1) (x2 y2)");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        Line l1=new Line(x1,y1,x2,y2);
        l1.getLength();

    }
}
