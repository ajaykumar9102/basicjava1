class T3{             //this is the multilevel inheritance//
    void display(){
        System.out.println("hi");
    }
}class T4 extends T3{

}class T5{
    void dis(){
        System.out.println("welcome");
    }
}class T6 extends T5{

}
public class Multi {
    public  static void main(String args []){
        T4 td=new T4();
        td.display();
        T6 td1=new T6();
        td1.dis();

    }
    
}
