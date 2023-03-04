interface I{
    public abstract void showl();
}


public class LembdaexpressionannonymoumsInnerclass {
    public static void main(String args[]){
    I obj=()->{
        System.out.println("inner class");};
    obj.showl() ; 
}}
