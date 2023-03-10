abstract class M{
    abstract void show();

}
interface N {
    void display();
}
class O extends M implements  N{
    public void show(){
        System.out.println("show");
    }public void display(){
        System.out.println("display");
    }

}

public class Interface3 {public static void main(String args[]){
    O obj=new O();
    obj.show();
    obj.display();

}
    
}
