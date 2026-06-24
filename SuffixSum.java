public class SuffixSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for (int i=0;i<arr.length;i++){
            // System.out.print(arr[i]+" ");
        }

        //Output should be [15,14,12,9,5], peeche se add krke print krna h
      int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        
        
        System.out.println(sum);
        }
    }
}
