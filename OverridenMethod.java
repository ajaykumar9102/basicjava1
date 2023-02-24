class Aeroplane{
   void takeoff(){
    System.out.println("aerooplane is starting  for fly");
   }
   
    void fly(){
        System.out.println("areoplane is flying");
    }
}class T10 extends Aeroplane {// in this class inherited method is present//

}class Cargoplane extends Aeroplane{
    void takeoff(){
        System.out.println("cargoplane is starting for fly");//this is the overiden method //
    }
    void fly(){
        System.out.println("cargoplane is  flying");   //this is  also overide method//

    }void special(){
        System.out.println("cargoplane  carry goods");//this is the specialised method//
    }

}class Passengerplane extends Aeroplane{
    void takeoff(){
        System.out.println("Passengerplane is starting for fly"); ////this is the overiden method //
    }
    void fly(){
        System.out.println("Passengerplaneis  flying");////this is the overiden method //

    }void special(){
        System.out.println("Passengerplane carry Passenger");  //this is the specialised method//
    }
    }




public class OverridenMethod {
    public static void main (String args []){
        T10 td=new T10();
        td.takeoff();
        td.fly();
        Cargoplane td1=new Cargoplane();
        td1.takeoff();
        td1.fly();
        td1.special();
        Passengerplane  td2 =new Passengerplane ();
        td2.takeoff();
        td2.fly();
        td2.special();



    }

}
    

