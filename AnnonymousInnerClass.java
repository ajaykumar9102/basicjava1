interface L{
    public abstract void show();
}

public class AnnonymousInnerClass {public static void main(String args []){
    L obj=new L(){
        public void show(){
            System.out.println("show");
        }
    };obj.show();

    

}
    
}
