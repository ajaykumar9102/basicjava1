class J{
     class K{
        public void display(){
            System.out.println("it is the inner class");
        }
    }
}


public class Innerclass {public static void main(String args []){
    J obj=new J();
    J.K obj1 =obj. new K();//FOR NON-STATIC INNER CLASS//
    //J.K obj1=new J.K();//IT IS ONLY VALID FOR STATIC CLASS//
    obj1.display();
}
    
}
