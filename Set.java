//Q11
import java.util.*;
public class Set
{
    int arr[];
    int n;
    Set(){
        n=0;
        arr=new int[n];
    }
    Set(int nn){
        n=nn;
        arr=new int[n];
    }
    void readlist(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter set");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    int isset(Set s){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                if(s.arr[i]==s.arr[j])
                return 0;
                }
            }
        }
        return 1;
    }
    Set intersection(Set s1, Set s2){
        Set obj = new Set(s1.n);
        for(int i=0;i<s1.n;i++){
            for(int j=0;j<s2.n;j++){
                if(s1.arr[i]==s2.arr[j]){
                    obj.arr[n++]=s1.arr[i];
                }
            }
        }
        return obj;
    }
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first set");
        Set s1 = new Set(sc.nextInt());
        s1.readlist();
        System.out.println("Enter the size of second set");
        Set s2 = new Set(sc.nextInt());
        s2.readlist();
        Set s3 = new Set(s1.n);
        if(isset(s1)==1&&isset(s2)==1){
            s3 = intersection(s1,s2);
            if(n!=0){
            System.out.println("Intersection elements");
            for(int i=0; i<n;i++){
                System.out.println(s3.arr[i]);
            }}
            else
            System.out.println("No common element");
        }   
        else
        System.out.println("multiset");
    }
    void main(){
        display();
    }
}
