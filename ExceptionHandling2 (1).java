
import java.util.*;// HERE DUCKING CONCEPT IS USED;//

class MyException extends Exception{
MyException(String str){
    super(str);
}
}


public class ExceptionHandling2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int a=scan.nextInt();
        System.out.println("enter second number");
        int b=scan.nextInt();
        try{if(b<0){
            Exception e=new MyException("negative number");//here self exception arrise //
            throw e;
        }else{
            int result =a/b;
            System.out.println(result);
        }}
        catch(Exception e){
            System.out.println("enter a valid number"+" "+e);
            
        }

    
}}
