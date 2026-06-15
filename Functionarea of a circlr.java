import java.util.Scanner;
public class Main {
    // Function to calculate area of a circle
    static double calculateArea(double radius) {
        
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = calculateArea(radius);
        System.out.println("Area of Circle = " + area);
        sc.close();
    }
}
