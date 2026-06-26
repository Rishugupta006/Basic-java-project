import java.util.Scanner;
class Oddevensum{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.:");
int a=sc.nextInt();
int evensum=0; int oddsum=0; 
   System.out.println("Enter " + a + " integers:");
for(int i=1;i<=a;i++)
{
    int num=sc.nextInt();
    if(num%2==0){
        evensum += num;
    }
    else{
        oddsum += num;
    }
}

    System.out.println("sum of even no:"+evensum);

 System.out.println("sum of odd no:"+oddsum);
    }
}
