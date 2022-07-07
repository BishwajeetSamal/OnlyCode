//Reverse a String
public class ReverseString {
    public static void main(String []args){
        String sb = "Bishwajeet";
        char[] strCh = sb.toCharArray();
        String sb1  = "";
        for(int i=sb.length()-1;i>=0;i--){
           sb1=  sb1+strCh[i];
        }

        System.out.println(sb1);
    }
}
