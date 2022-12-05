//Q19
import java.util.*;
public class encode
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the encoded message");
        String c= sc.nextLine();
        int num;
        for(int i=0;i<c.length();){
            num=Character.getNumericValue(c.charAt(c.length()-1-i))*10+
                Character.getNumericValue(c.charAt(c.length()-i-2));
            if(num<65&& num!=32){
                num=Character.getNumericValue(c.charAt(c.length()-1-i))*100+
                Character.getNumericValue(c.charAt(c.length()-i-2))*10+
                Character.getNumericValue(c.charAt(c.length()-i-3));
                i+=3;
                System.out.print((char)num);
            }
            else{
                System.out.print((char)num);
                i+=2;
            }
        }
    }
}
