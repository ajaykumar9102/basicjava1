public class ThreadConcept {
    public static void main(String args[]){

        System.out.println("hi thread");
      try{ Thread.sleep(2000);}
      catch (Exception e){
        System.out.println("error is "+ " "+e);
      }
        System.out.println("hello thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());//priority is 5;
    }

}