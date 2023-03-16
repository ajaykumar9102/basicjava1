public class ThreadBasic {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t=Thread.currentThread();
       try{ System.out.println(t.isAlive());}
       catch(Exception e){
        System.out.println(e);
       }
        t.start();
        System.out.println(t.isAlive());
        

        
    }
    
}
