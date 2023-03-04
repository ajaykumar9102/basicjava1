class Test{   // this is the hierachical inheritance//
    void td(){
        System.out.println("hi");
    }
}class Testt extends Test{

}class Testtt extends Test{

}public class Inheritance{
    public static void main(String args []){
        Testt t=new Testt ();
        t.td();
        Testtt t2=new Testtt ();
        t2.td();

    }
}