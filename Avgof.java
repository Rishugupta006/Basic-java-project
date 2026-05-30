import java.util.Scanner;
class Avgof{
    public static void  average(){
                      Scanner  sc=new Scanner(System.in);
                      System.out.println("enter the three no:");
        double  a=sc.nextDouble();
        double  b=sc.nextDouble();
        double  c=sc.nextDouble();
        double avg=(a+b+c)/3;
             System.out.print("average is:"+avg);
             sc.close();
            }
            public static void main(String args[]){
       average();

            }
}