//Q15
import java.util.*;
public class Recursivepower
{
    int power,k,l;
    Recursivepower(){
        power=0;
    }
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter k and l");
        k= sc.nextInt();
        l= sc.nextInt();
    }
    int powerof(int k, int l){
        if(l==0)
        return 1;
        return k*powerof(k,l-1);
    }
    void setpower(){
        power=powerof(k,l);
    }
    void display(){
        System.out.println(power);
    }
    void main(){
        input();
        setpower();
        display();
    }
}
