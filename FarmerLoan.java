import java.util.*;
abstract class Farmer{
     static float ri=12.5f;
     
     float p;
     float td;
     float amt;
    
    float si;
   abstract  void input();
   abstract  void compute();
   void display(){
    System.out.println("the simple intrest is= "+si);
    System.out.println("total amount is ="+ amt);
   }
   

}class Farmer1 extends Farmer{
    void input(){
        Scanner scan =new Scanner(System.in);
        System.out.println("entetr the principal which is required required");
        p=scan.nextFloat();
        System.out.println("entetr the timeduration which is required required");
        td=scan.nextFloat();

    }void compute(){
        si=(p*ri*td)/100 ;
        amt =si+p;
    }
}class Farmer2 extends Farmer{
    void input(){
        Scanner scan =new Scanner(System.in);
        System.out.println("entetr the principal which is required required");
        p=scan.nextFloat();
        System.out.println("entetr the time duration  which is required required");
        td=scan.nextFloat();

    }void compute(){
        si=(p*ri*td)/100 ;
        amt =si+p;
    }
}class Farmer3 extends Farmer{
    void input(){
        Scanner scan =new Scanner(System.in);
        System.out.println("entetr the principal which is required required");
        p=scan.nextFloat();
        System.out.println("entetr the time duration which is required required");
        td=scan.nextFloat();

    }void compute(){
        si=(p*ri*td)/100 ;
        amt =si+p;
    }
}class Farmer4 extends Farmer{
    void input(){
        Scanner scan =new Scanner(System.in);
        System.out.println("entetr the principal which is required required");
        p=scan.nextFloat();
        System.out.println("entetr the time duration which is required required");
        td=scan.nextFloat();

    }void compute(){
        si=(p*ri*td)/100 ;
        amt =si+p;
    }
}
class Relation{
    void poly(Farmer ref){
        ref.input();
        ref.compute();
        ref.display();
    }
}









public class FarmerLoan {public static void main(String args []){


    Farmer1 f1 =new Farmer1();
    Farmer2 f2 =new Farmer2();
    Farmer3 f3 =new Farmer3();
    Farmer4 f4 =new Farmer4();
    Relation r=new Relation();
    r.poly(f1);
    r.poly(f2);
    r.poly(f3);
    r.poly(f4);
    
}
}