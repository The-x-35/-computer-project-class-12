//Q2
import java.util.*;
public class ISBN{
 public void main(){
  int x=1,sum=0,n=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter ISBN number.");
  String ISBN = sc.nextLine();
  String ys= ISBN.substring(0,9);
  int y = Integer.parseInt(ys);
  while(y>0){
   n=y%10;
   sum+= n*(++x);
   y=y/10;}
  char z = ISBN.charAt(9);
  if(z=='X')
  sum+=10;
  else{
   n= Character.getNumericValue(z);
   sum+=n;}
   System.out.println("Sum="+sum);
   if (sum%11==0)
    System.out.println("Leaves no remainder-valid ISBN ");
  else
    System.out.println("Leaves remainder-invalid ISBN ");
    }
}
