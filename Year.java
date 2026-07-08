import java.util.Scanner;
class Year{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the year:");
float  a=sc.nextFloat();
if((a%4==0 && a%100!=0)||(a%400==0))
{
    System.out.println("leap year hai");
}
else{
    System.out.println("leap year nahi hai ");
}
    }}
    