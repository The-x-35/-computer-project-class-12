//Q10
import java.util.*;
public class clock
{
   void main(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter time");
       int h = sc.nextInt();
       int m = sc.nextInt();
       String a[]= {"one","two","three","four","five","six","seven","eight","nine","ten",
                    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
                    "eighteen","nineteen","twenty"};
       String b[]={"twenty","thirty","fourty","fifty"};
       if(h>0 && h<=12 && m>=0 && m<=60){
           System.out.print(h);
           if(m<10)
           System.out.print(":0"+m+"\t");
           else
           System.out.print(":"+m+"\t");
           if(h==12)
           h=0;
           if(m==0)
           System.out.print(a[h-1]+" O' clock");
           else if(m==15)
           System.out.print("quarter past "+a[h-1]);
           else if(m<=20)
           System.out.print(a[m-1]+" minutes past "+a[h-1]);
           else if(m<30)
           System.out.print("twenty "+a[m-21]+" minutes past "+a[h-1]);
           else if(m==30)
           System.out.print("half past "+a[h-1]);
           else if (m==45)
           System.out.println("quarter to "+a[h]);
           else if(m<=40)
           System.out.print("twenty "+a[39-m]+" minutes to "+a[h]);
           else 
           System.out.print(a[59-m]+" minutes to "+a[h]);
       }
       else
       System.out.println("incorrect input");
   }
}
