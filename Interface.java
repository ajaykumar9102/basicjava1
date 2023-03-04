import java.util.*;
interface A{
    public abstract void takeoff();
    public abstract void fly();
}
class Passengerplane implements A{
    public void takeoff(){System.out.println("passengerplane is to start");}
    public void fly(){
        System.out.println("passengerplane is flying");
    
    }
  public void special(){
    System.out.println("passengerplane carry passenger");
  }

}
class Cargoplane implements A{
    public void takeoff(){System.out.println("cargoplane is to start");}
    public void fly(){
        System.out.println("cargoplane is flying");
    
    }
  public void special(){
    System.out.println("cargoplane carry passenger");
  }


}
class Joint {           //polymorphism//
    public void poly(A ref){
        ref.takeoff();
        ref.fly();
    }
}

public class Interface {
    public static void main(String args []){
        Cargoplane cp=new Cargoplane();
        Passengerplane pp=new Passengerplane();
        Joint jt=new Joint();
        jt.poly(cp);
        jt.poly(pp);

    }
    
}
