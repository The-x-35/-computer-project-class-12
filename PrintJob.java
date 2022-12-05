//Q14
import java.util.*;
public class PrintJob
{
    int job[];
    int Newjob;
    int Capacity;
    int Front;
    int Rear;
    PrintJob(){
        Capacity=20;
        Front=-1;
        Rear= -1;
        createJob();
    }
    void createJob(){
        job= new int[Capacity];
    }
    void addJob(){
        if(Rear== (Capacity-1)){
            System.out.println("Printjob is full, cannot add any more");
        }
        else if(Rear==-1&& Front==-1){
            Front++;
            Rear++;
        }
        else
        Rear++;
    }
    void removeJob(){
        if(Front==-1&&Rear==-1){
            System.out.println("Printjob is empty");
        }
        else if(Front==0&&Rear==0){
            Front--;
            Rear--;
        }
        else
        Front++;
    }
    void main(){
        System.out.println("Enter 1 to add printjob or 2 to remove printjob"); 
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1)
        addJob();
        else if(a==2)
        removeJob();
        else
        System.out.println("Invalid choice");
    }
}
