//Q20
import java.util.*; 
public class time
{
    void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter login time");
        String lin= sc.nextLine();
        System.out.println("Enter logout time");
        String lout= sc.nextLine();
        int linh=Character.getNumericValue(lin.charAt(0))*10+
                 Character.getNumericValue(lin.charAt(1));
        int linm=Character.getNumericValue(lin.charAt(3))*10+
                 Character.getNumericValue(lin.charAt(4));
        int louth=Character.getNumericValue(lout.charAt(0))*10+
                 Character.getNumericValue(lout.charAt(1));
        int loutm=Character.getNumericValue(lout.charAt(3))*10+
                 Character.getNumericValue(lout.charAt(4));
        if(lin.charAt(6)=='P')
           linh+=12;
        if(lout.charAt(6)=='P')
           louth+=12;
        System.out.println("Total time: "+(louth-linh)+" Hrs "+(loutm-linm)+" Min");
        System.out.println("Your amount: Rs "+(((louth-linh)*60+(loutm-linm))*0.16));
    }
}
