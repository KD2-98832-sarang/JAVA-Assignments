import java.util.*;

public class pallindromeString{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.nextLine();
        String reverse=" ";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
             if(str.equals(reverse)){
                System.out.println("string is Pallindrome");
             }else{
                System.out.println("String is not pallindrome");
             }
    }
}