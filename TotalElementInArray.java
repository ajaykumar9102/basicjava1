public class TotalElementInArray {
    public static void main(String args []){
        int array[]={1,2,3,4,5};
        int count =0;
        int sum=0;

        for(int i=0;i<array.length;i++){
            count++;
            
            sum +=array[i];
        }System.out.println(sum);
        System.out.println(count);
    }
    }
    

