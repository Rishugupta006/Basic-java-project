import java.util.Scanner;
class Max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the sec number:");
        int b=sc.nextInt();
         System.out.println("enter the third number:");
        int e=sc.nextInt();
        int c=Math.max(a,Math.max(b,e));
System.out.println(" the max number:"+c);
        

    }
}