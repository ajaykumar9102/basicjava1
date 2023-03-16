import java.util.*; //this program is done by join method//
class Carr implements Runnable{
    public void run(){
       try{ System.out.println(Thread.currentThread().getName()+"has enter in the parking lot");
        Thread.sleep(2000);}
        catch(Exception e){
            System.out.println(e);
        }
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
  
    }}


public class ThreadConcept4{
    public static void main(String[] args) {
        Carr c= new Carr();
        Thread t=new Thread(c);
       try{ t.start();
        t.join();
        Thread t1=new Thread(c);
        t1.start();
        t1.join();
        Thread t2=new Thread(c);
        t2.start();
        t2.join();}
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
