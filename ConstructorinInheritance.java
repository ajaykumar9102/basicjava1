class T7{  //private member and constructor  not take part in inheritance//
    int a;
    int b;
    T7(){
        System.out.println("this is the zeroparametrised ");

    }void dis(){
        System.out.println("this is the inherited method ");
    }
    T7(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);
    
    }
}class T8 extends T7{//here in the back scene default constructor "T8() and super() in the first line of constructor" due 
      void display() {
        System.out.println("this is  the specialised method");
      }                //this we get output of main constructor //here inheritance  process is not present//

}class T9 extends T7 {
    T9 (){
        super(12,34);
    }
}

public class ConstructorinInheritance {
    public static void main(String args []){
        T8 td= new T8();//this is thecalling of zero parametrised constrctor//
         td.display();
         td.dis();// this is only who take part in inheritance from T7class//
        T9 td1=new T9();// THIS IS CALLING OF non argument const.in 
                         //which super() calling parent class constructor which is parameterised//
    }
    
}
