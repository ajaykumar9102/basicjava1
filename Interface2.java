interface E{
    public static final int age=45;
    public abstract void show();
    default void display(){
        System.out.println("display");}
        static void play(){   //static method not inherite in child class//
            System.out.println("play");
        
    }//E(){//
     ///   System.out.println("it is the constructor which is not allowed in  in interface concept");//
    //}//
}
class F implements E{
    public void show(){
        System.out.println("show");
    }

   
}


public class Interface2 {
    public static void main(String args []){
        F obj=new  F();
        obj.show();
        obj.display();
       // obj.play();

    }
    
}
