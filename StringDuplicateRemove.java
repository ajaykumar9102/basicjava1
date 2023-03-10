import java.util.*;
public class StringDuplicateRemove{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter content");
        String str=scan.next();
      // String str="ajay";
        String str1="";
        boolean flag=false;
            
        
        for( int i=0;i<str.length();i++){ int count=0;
            for(int j=i+1;j<str.length();j++){
      
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                   System.out.println(count);
                    System.out.println(str.charAt(i));
                    flag=true;
                }
           }};
        for(int k=0;k<str.length();k++){
        if(flag==false){ str1=str1+str.charAt(k);
           
        }

    }System.out.println("AFTER REMOVING DUPLICATE FROM STRING ="+" "+ str1);}
}