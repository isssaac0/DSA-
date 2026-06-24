import java.util.*;
public class SumAvgMax {
    public static void main(String args[]){
        int nums[]={2,4,5,6,66,};
        for(int i=0;i<nums.length;i++){
            int sum=0;
            sum+=nums[i];
            System.out.println("Sum: "+sum);
            System.out.println("Avg: "+sum/nums.length );
        }

        int max=0;
        for(int i=1;i<nums.length-1
            ;i++){
            if(nums[i+1]>nums[i]){
                max=nums[i+1];
            }
        }
            System.out.println(max);

        
    }
}
