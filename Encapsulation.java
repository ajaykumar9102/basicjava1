class Studentttt{
    private int age;
    private int marks;
    void setvalue(int age ,int marks){
        this.age=age;
        this.marks=marks;
    }void getvalue(){
        System.out.println(age);
        System.out.println(marks);
    }

}

public class Encapsulation {
    public static void main(String args []){
        Studentttt st=new Studentttt();
        st.setvalue(20,45);
        st.getvalue();

}
    
}
