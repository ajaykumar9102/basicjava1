import java.util.*;//this programm is done by synchronized key word//
class Car implements Runnable{
    public void run(){
       try{ System.out.println(Thread.currentThread().getName()+"has enter in the parking lot");
        Thread.sleep(2000);}
        catch(Exception e){
            System.out.println(e);
        }synchronized(this){
       try{ System.out.println(Thread.currentThread().getName()+"got into the car");
        Thread.sleep(2000);}
        catch(Exception e){
            System.out.println(e);
        }
       try{ System.out.println(Thread.currentThread().getName()+"starting the car");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"come back in the parking lot ");
    }
    catch(Exception e){
        System.out.println(e);
    }
  
    }}}


public class ThreadConcept3{
    public static void main(String[] args) {
        Car c= new Car();
        Thread t=new Thread(c);
        t.start();
        Thread t1=new Thread(c);
        t1.start();
        Thread t2=new Thread(c);
        t2.start();
        
    }
}