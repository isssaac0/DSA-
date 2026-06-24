public class AllSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int j=0;
            if( j<arr.length){
            j=i+1;
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
        for(int i=0;i<arr.length;i++){
            int j=0;
            int k=0;
            if(j<arr.length && k < arr.length){
                j=i+1;
                k=i+2;
                System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
            }
        }
     

    }
}
