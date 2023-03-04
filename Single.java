class T{            //this is the single level inheritance//
    void display (){
        System.out.println("hi");
    }
}class T2 extends T{

}
public class Single {
    public static void main(String args[]){
        T2 td=new T2();
        td.display();

    }
    
}
