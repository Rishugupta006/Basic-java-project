import java.util.Scanner;
class Sumofinteger{
    public static void Integersum(){
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int a=sc.nextInt();
         int reversed=0;
         while(a>0){
        int digit=a%10;
        reversed=reversed+digit;
        a=a/10;}
         System.out.println("sum of integer is :"+reversed);
    
    }
    public  static  void main(String args[]){
        Integersum();
    }
    }