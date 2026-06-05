import java.util.Scanner;
class Checkduplicate{
    public static boolean duplicate(int[] nums){
        
         for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if(nums[i]==nums[j]){
            return true;
        }
    }
        }
    
     
            return false;
         
    }
    public static void main(String args[]){
        int[] nums1 = {1, 2, 1, 4};
        int[] nums2 = {1, 2, 3, 1};
        System.out.println(duplicate(nums1));
        System.out.println(duplicate(nums2));
    }
    }
