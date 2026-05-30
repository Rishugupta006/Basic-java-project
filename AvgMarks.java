import java.util.Scanner;
class AvgMarks{
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        for(int i=1;i<=25;i++)
        {
            int marks=sc.nextInt();
             sum=sum+marks;
             double avg=sum/25;
             System.out.println("avg marks is :"+avg);
        }

    }
}