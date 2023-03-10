import java.util.*;
class Ducking{
    public void division(int a,int b){
        
        int result=a/b;
        System.out.println(result);
        diivision(5,0);


    }public void diivision(int c,int d){
        //c=8;d=0;
        int resultt=c/d;
        System.out.println(resultt);
    }
}

public class ExceptionHandling3 {
    public static void main(String args []){
        Ducking ref=new Ducking();
       try{ ref.division(4,0);}
       catch(Exception e){
        System.out.println("here exception arrise"+ e);
       }


    }
    
}
