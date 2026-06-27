import java.util.Scanner;
class Palindrome{
    public static void Ispalindrome(){
      Scanner  sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int a=sc.nextInt();
        int  orignal=a;
         int reversed=0;
         while(a>0){
        int digit=a%10;
        reversed=reversed*10+digit;
        a=a/10;
    }
        if(orignal==reversed){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String args[]){
        Ispalindrome();
    }
}
