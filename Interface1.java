interface B{        //HERE MULTIPLE INTERFACE EXIST,WHILE MULTIPLE I NHERITANCE NOT EXIST//
    public static final int age=19;
    public abstract void show();
}interface C{
    public static final int marks=45;
    public abstract void display();
}class D implements B,C{
    public  void show(){
        System.out.println("show");
}public  void display(){
    System.out.println("display");
}


}








public class Interface1 {public static void main(String args[]){
  System.out.println(D.age+" "+D.marks);
  D obj= new D();
 // B obj1= new D();//RETURN TYPE PARENT CLASS//
 // C obj2= new D();//RETURN TYPE PARENT CLASS//
  
  obj.show();
  obj.display();
 // obj1.show();//
 // obj1.display();//
 // obj2.show();//
 // obj2.display();//

}
    
}
