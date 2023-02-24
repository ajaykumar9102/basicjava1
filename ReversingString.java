public abstract class ReversingString {
    public static void main(String args []){
        String str="Think Twice";//output:kniht eciwt;
            str=str.toLowerCase();
            String ch []=str.split(" ");
          String str1=ch[0];
         String str2="";
          for(int i=str1.length()-1;i>=0;i--){
           str2 +=str1.charAt(i);
          }
          String str3=ch[1];
          String str4="";
           for(int i=str1.length()-1;i>=0;i--){
            str4 +=str3.charAt(i);
           }
           String result =str2+" "+str4;
           System.out.println(result);
            
        }
      
       
      
      }
         
    

