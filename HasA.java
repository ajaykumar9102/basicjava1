class Student{
    private Heart h;
    Student(Heart h){
        this.h=h;
    }void setH(Heart h){
        this.h=h;
    }
    void call(){
        h.heartbeate();
    }


}
class Heart{
    void heartbeate(){
        System.out.println("heartbeate is very important");
    }
}


public class HasA {
    public static void main(String args []){
        Heart h=new Heart();
        Student st=new Student(h);
        st.call();
        st.setH(h);
        st.call();

    }
    
}
