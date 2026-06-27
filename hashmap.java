import java.util.*;
public class hashmap{
    public static void main(String[] args) {
        int [] arr={1,3,4,54,5,5,3,2,};
    HashMap <Integer, Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq);
        
    }
}