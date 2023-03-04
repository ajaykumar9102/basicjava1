import java.util.*;
abstract class Shape{
    float area;
    abstract void input();
    abstract void compute();
    void display (){
        System.out.println("the area =" + area);
    }

}class Rectangle extends Shape{
    float length;
    float breadth;
  void input(){
        System.out.println("calculation related rectangle wiil be start");
        Scanner scan =new Scanner(System.in);
        System.out.println("enter length of rectangle");
        length=scan.nextFloat();
        System.out.println("enter length of rectangle");
        breadth=scan.nextFloat();


    }void compute(){
        area=(length*breadth);
    }

    
}class Square extends Shape {
    
    float length;
    void input(){
    System.out.println("calculation related square wiil be start");
    Scanner scan =new Scanner(System.in);
    System.out.println("enter length of square");
    length=scan.nextFloat();
   


}void compute(){
    area=length*length;
}}
class Circle extends Shape{ float radius;
   
  void input(){
        System.out.println("calculation related square wiil be start");
        Scanner scan =new Scanner(System.in);
        System.out.println("enter radius of rectangle");
        radius=scan.nextFloat();
        

    }void compute(){
        area=(radius*3.14f);
    }

    

}
class Geometry{
    void poly(Shape ref){
        ref.input();
        ref.compute();
        ref.display();
    }
}




public class AreaRelated {public static void main(String args[]){
    Rectangle re=new Rectangle();
    Square sq=new Square();
    Circle c=new Circle();
    Geometry g=new Geometry();
    g.poly(re);
    g.poly(sq);
    g.poly(c);

}
    
}
