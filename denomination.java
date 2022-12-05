//Q9
import java.util.*;
public class denomination
{
    void main(){
        String arr[]= {"ZERO","ONE","TWO","THREE","FOUR","FIVE",
                       "SIX","SEVEN","EIGHT","NINE","TEN"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt = sc.nextInt();
        if (amt>0&& amt<=99999){
            int x=0,n=0,c=0,t=amt;
            while(amt>0){
                x=amt%10;
                n= (n*10)+x;
                amt /= 10;
            }
            amt=t;
            while(n>0){
                x= n%10;
                System.out.print(arr[x]+" ");
                n /= 10;
            }
            System.out.println();
            int D[]= {1000,500,100,50,20,10,5,2,1};
            for(int i=0; i<9; i++){
                if(amt/D[i] !=0){
                x=amt/D[i];
                System.out.println(D[i]+" X " +x+" ="+(x*D[i]));
                amt = amt%D[i];
                c+=x;
            }
            }
            System.out.println("TOTAL = "+t+"\n"+"Total number of notes = "+c);
        }
        else
        System.out.println("INVALID AMOUNT");
    }
}
