import java.util.Scanner;
 class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Formula: Area = π * r^2
        double area = Math.PI * radius * radius;

        // Output result
        System.out.println("Area of the circle = " + area);

        sc.close();
    }
}
