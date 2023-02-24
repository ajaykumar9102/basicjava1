import java.util.*;
public class Pangram {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a word");
        String str=scan.next();
        str=str.toUpperCase();
        str=str.replace(" ","");
        char ch[]=str.toCharArray();
        int ch2[]=new int [26];
        boolean t=false;
        for(int i=0;i<ch.length-1;i++){
            ch2[ch[i]-65]++;
        }for(int j=0;j<ch2.length-1;j++){
            if(ch2[j]==0){
                System.out.println("these are not pangram");
                t=true;
                break;
            }
        }
        if(t==false)

{System.out.println("it is pangram");}

    }
    
}
