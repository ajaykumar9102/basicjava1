class Libb implements Runnable{
    public void run(){
        String t="java";
        String t2="dsa";
        String t3="squl";
        String str=Thread.currentThread().getName();
       synchronized (this){ if(str.equals("student1")){
            try{synchronized(t){
                System.out.println(Thread.currentThread().getName()+"apply lock on java book");
                Thread.sleep(2000);
            }

                synchronized(t2){
                System.out.println(Thread.currentThread().getName()+"apply lock on dsa book");
                Thread.sleep(2000);
            }
            synchronized(t3){
                System.out.println(Thread.currentThread().getName()+"apply lock on squl book");
                Thread.sleep(2000);
            }
        

            }catch (Exception e){
                System.out.println(e);
            }
        }else{
            try{ synchronized(t){
                System.out.println(Thread.currentThread().getName()+"apply lock on java book");
                Thread.sleep(2000);
            } synchronized(t2){
                System.out.println(Thread.currentThread().getName()+"apply lock on dsa book");
                Thread.sleep(2000);
            } synchronized(t3){
                System.out.println(Thread.currentThread().getName()+"apply lock on squl book");
                Thread.sleep(2000);
            }

            }catch (Exception e){
                System.out.println(e);
            }
        }


    }
}}

public class ThreadConcept7 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" ");
        Libb l=new Libb();
        Thread t=new Thread(l);
        t.setName("student1");
        t.start();
        Thread t2=new Thread(l);
        t2.setName("student2");
        t2.start();
        

        System.out.println(Thread.currentThread().getName());
        
    }
    
}
