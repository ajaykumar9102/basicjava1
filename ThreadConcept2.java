import java.util.*;//ssame programm done by implements Runnable concept//
 class  B implements Runnable{public void run(){
    System.out.println(Thread.currentThread().getName()+ "calculation task is started");
     
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number");
     int a=scan.nextInt();
    System.out.println("enter second number");
     int b=scan.nextInt();
    System.out.println(Thread.currentThread().getName()+" "+a+b);
    System.out.println(Thread.currentThread().getName()+"calculation task is ended");
    



}
}class Messagee implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Message  is display");
    }
}
public class ThreadConcept2{
    public static void main(String[] args) {
        B t1=new B();
        Messagee t2=new Messagee();
        Thread t=new Thread(t1);
        Thread t3=new Thread(t2);
        t.start();
       try{ t.join();}//this method are used for if we want one thread complete its own task then we use//
       catch(Exception e){
        System.out.println(e);
       }
        t3.start();
       // t2.join();

        
    }}


