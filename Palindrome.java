import java.util.*;
public class Palindrome {
    public static void main(String args []){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String name=scan.next();
        String name2="";
        for(int i=name.length()-1;i>=0;i--){
            name2=name2+name.charAt(i);
        }
        if(name.equals(name2)){
            System.out.println("name and name2 are palindrome");
        }else{System.out.println("NOT");}

    }
    
}
