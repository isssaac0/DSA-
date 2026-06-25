import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String s="moom";

        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        String p=sb.toString();
        if(s.equalsIgnoreCase(p)){
            System.out.println("Yes it is a palindrome");

        }else{
            System.out.println("Its not a palindrome");
        }

    }
}
