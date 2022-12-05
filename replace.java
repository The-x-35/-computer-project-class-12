//Q5
import java.util.*;
public class replace
{
    String str, substr;
    replace(){
        str="";
        substr="";
    }
    replace(String s){
        str=s;
    }
    void display(){
        System.out.println("str="+str+"\n"+"substr="+substr+"\n"+"frequency="+find_frequency());
    }
    void getword(String ss){
        substr=ss;
    }
    int find_frequency(){
        int m = substr.length();
        int n = str.length();
        int f=0;
        for(int i =0; i<=n-m; i++){
            for(int j=0; j<m; j++){
                if(str.charAt(i+j) != substr.charAt(j))
                    break;   
                f++;
            }
        }
        return f/m;
    }
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter substr");
        String sbst= sc.nextLine();
        getword(sbst);
        display();
    }
}
