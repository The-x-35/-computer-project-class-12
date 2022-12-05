//Q16
import java.util.*;
public class PrintPrime
{
    String str;
    int c;
    void getdata(){
        System.out.println("Enter the String without spaces");
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        c=str.length();
    }
    void printp(int p, int q){
        int co=0;
        for(int i=1;i<=p;i++){
            if(p%i==0)
            co++;
        }
        if(p==q)
        System.out.println("");
        else if(co==2){
            System.out.print(str.charAt(p));
            printp(p+1,c);
        }
        else
        printp(p+1,c);
    }
    void main(){
        getdata();
        printp(2,c);
    }
}
