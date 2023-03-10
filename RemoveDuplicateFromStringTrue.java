import java.util.*;
public class RemoveDuplicateFromStringTrue{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter content");
        String str1=scan.nextLine();
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            int idx=str1.indexOf(ch,i+1);
            if (idx==-1){
                str2.append(ch);
            }
        

    }System.out.println(str2);
}}