class Library implements Runnable{
    public void run(){
        String t="math";
        String t2="science";
        String t3="chemistry";
      synchronized(this){ try{ System.out.println(Thread.currentThread().getName()+"has enter in the library");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"apply dead lock on"+t);
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"apply dead lock on"+t2);
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"apply dead lock on"+t3);
        Thread.sleep(2000);}
        catch (Exception e){
            System.out.println(e);
        }
    }

}}

public class ThreadConcept5 {
    public static void main(String[] args) {
        
       try{ System.out.println(Thread.currentThread().getName()+" "+"this is the main thread");
        Library lb=new Library();
        Thread t5=new Thread(lb);
        t5.start();
        Thread t6=new Thread(lb);
        t6.start();}
        catch (Exception e){
            System.out.println(e);
        }
    }
    
}
