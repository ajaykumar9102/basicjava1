import java.util.*;
import java.util.Arrays;


public class Anagram {
    public static void main(String args []){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a word");
    String name=scan.next();
    System.out.println("enter second word");
    String name2=scan.next();
   name=name.toUpperCase();
    name2=name2.toUpperCase();
    char array[]=name.toCharArray();
    char array2[]=name2.toCharArray();
    Arrays.sort(array);
    Arrays.sort(array2);
    if(Arrays.equals(array,array2)){
        System.out.println("name and name2 are anagram");
    }else{ System.out.println("name and name2 are not anagram");}


   


    }
    
}
