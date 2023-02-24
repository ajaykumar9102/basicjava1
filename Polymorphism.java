 abstract class Aeroplane{
    abstract public void  takeoff();
abstract public void fly();
}
class Cargoplane extends Aeroplane{
    public void takeoff(){
        System.out.println("cargoplane is to start");
    }public void fly(){
        System.out.println("cargoplane is flying");
    }public void special(){
        System.out.println("cargoplanre carry goods");
    }
}class Polymor{
    void poly(Aeroplane ref){
        ref.takeoff();
        ref.fly();
        System.out.println("____________________________________________________________________");

    }
}class Passengerplane extends Aeroplane {
    public void takeoff(){
        System.out.println("Passengerplane is to start");
    }public void fly(){
        System.out.println("Passengerplane is flying");
    }public void special(){
        System.out.println("Passengerplane carry passenger");
    }
    
}
public class Polymorphism{
    public static void main (String args []){
        Aeroplane cp=new Cargoplane();
        Aeroplane pp=new Passengerplane();
        Polymor td=new Polymor();
        td.poly(cp);
        td.poly(pp);
        ((Cargoplane) cp).special();
        ((Cargoplane) pp).special();
    

    }
}