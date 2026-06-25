public class MergingArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9};
        int arr[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr1[i];
        }
        for(int j=0;j<arr.length-1;j++){
            arr[arr1.length]=arr2[j];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
