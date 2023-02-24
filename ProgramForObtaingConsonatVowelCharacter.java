public class ProgramForObtaingConsonatVowelCharacter {
    
        public static void main(String args []){
         String str="asdfghjklzxcvbnmqwertyuiop!@#$%&*";
         int vcount=0;
         int ccount=0;
         int charcount=0;
         
         for(int i=0;i<str.length()-1;i++){
           
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vcount++;
       //System.out.print("total vowel:"+vcount);//System.out.println();
            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
               ccount +=1;
              // System.out.print("totalconsonant:"+ccount);//System.out.println();
          }
          else{charcount++;
                //System.out.print("total character:"+charcount);
           }
    
         }System.out.print("total vowel: "+vcount+"  ");
         System.out.print("totalconsonant: "+ccount+"  ");
         System.out.print("total character: "+charcount);
         
        }}
           
    

