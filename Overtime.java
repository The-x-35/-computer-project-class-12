//Q13
import java.util.*;
public class Overtime extends Staff
{
    int ndays;
    int ex_hrs;
    double rate;
    Overtime(int n, double r, int h){
        super();
        ndays = n;
        rate = r;
        ex_hrs = h;
    }
    Double calculate(){
        return Basic +(ndays*ex_hrs*rate);
    }
    void show_salary(){
        System.out.println(ndays+"\n"+rate+"\n"+calculate());
    }
}
