//Q12
import java.util.*;
public class date
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date");
        int d= sc.nextInt();
        int m= sc.nextInt();
        int y= sc.nextInt();
        if(d>0&&d<=31&& m>0&&m<=12)
            System.out.println("VALID DATE");
        else
            System.out.println("INVALID DATE");
        int day[] = { 31,28,31,30,31,30,31,31,30,31,30,31};
        int c=d;
        for(int i=0; i<(m-1);i++){
            c+=day[i];
        }
        System.out.println(c);
        String month[]={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(d+" "+month[m-1]+" "+y);
    }
}
