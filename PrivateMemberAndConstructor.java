class  T11{
    private int a=7;
    int age=8;
    T11(){
        System.out.println("this is parent class constructor");

    }void display(){
       
        System.out.println(a+" "+age );
    }

}class T12 extends T11{

}


public class PrivateMemberAndConstructor {
    public static void main(String args []){
        T12 td= new T12();
        td.display();

    }
    
}
