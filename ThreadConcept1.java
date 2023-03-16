import java.util.*;
class  A extends Thread{public void run(){
    System.out.println(Thread.currentThread().getName()+ "calculation task is started");
    
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number");
     int a=scan.nextInt();
    System.out.println("enter second number");
     int b=scan.nextInt();
    System.out.println(Thread.currentThread().getName()+" "+a+b);
    System.out.println(Thread.currentThread().getName()+"calculation task is ended");
    



}
}class Message extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Message  is display");
    }
}
public class ThreadConcept1{
    public static void main(String[] args) {
        A t1=new A();
        Message t2=new Message();
       // Thread t=new Thread(t1);
       // Thread t3=new Thread(t2);
        t1.start();
       try{ t1.join();}//this method are used for if we want one thread complete its own task then we use//
       catch(Exception e){
        System.out.println(e);
       }
        t2.start();
       // t2.join();

        
    }

}