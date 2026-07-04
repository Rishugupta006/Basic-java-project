import java.util.Scanner;
class SqArea{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of square:");
        double side=sc.nextDouble();
         double area=side*side;
         System.out.println("area of square:"+area);
    }
}