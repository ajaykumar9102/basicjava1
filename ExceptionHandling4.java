class Demoo {
    public void add (int a,int b){
        a=8;b=9;
        int result=a+b;
        System.out.println(result);
       try{ division(6,0);}
       catch(Exception e){
        System.out.println(e);
       }

    }public void division (int c,int d) throws Exception{
        int result=c/d;
        System.out.println(result);
    }
}


public class ExceptionHandling4 {
    public static void main(String args[]){

    }
    
}
