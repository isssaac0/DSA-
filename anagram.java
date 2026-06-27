import java.util.*;
public class anagram {
    public static void main(String[] args) {
        
    String s1="silent";
    String s2="listen";

char [] a1=s1.toCharArray();
char [] a2=s2.toCharArray();

Arrays.sort(a1);
Arrays.sort(a2);
if(Arrays.equals(a1,a2)){
    System.out.println("This is an anagram");
}else{
    System.out.println("This is not an anagram");
}

    }
}