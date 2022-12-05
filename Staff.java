//Q13
import java.util.*;
public class Staff
{
    int Code_num;
    String Sname;
    int Basic;
    Staff(){
        Code_num=0;
        Sname="";
        Basic=0;
    }
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Code number, Name and Basic salary");
        Code_num=sc.nextInt();
        Sname=sc.nextLine();
        Basic=sc.nextInt();
    }
    void printdata(){
        System.out.println(Code_num+"\n"+Sname+"\n"+Basic);
    }
}

