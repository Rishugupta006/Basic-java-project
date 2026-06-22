import java.util.*;
class InsertionSort{
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
        
            arr[prev+1]=curr;
        }
            for(int k=0;k<arr.length;k++){
             System.out.println(arr[k]);
             }
        }
    
    public static void main(String args[]){
        int arr[]={4,2,5,3,8};
        insertionSort(arr);
    }
}
