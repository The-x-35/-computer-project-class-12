//Q17
import java.util.*;
public class Binary
{
    int a[];
    int n;
    int l;
    int u;
    Binary(int num){
        n=num;
        a=new int[num];
        l=0;
        u=n-1;
    }
    void readdata(){
        System.out.println("Enter the elements in ascending order");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    int binary_search(int v){
         if (u >= l && u <= a.length - 1) {
            int mid = l + (u - l) / 2;
            if (a[mid] == v)
                return mid;
            if (a[mid] > v){
                u=mid-1;
                return binary_search(v);
            }
            l=mid+1;
            return binary_search(v);
        }
        return -1;
    }
    void main(){
        readdata();
        System.out.println("Enter the value to search");
        Scanner sc = new Scanner(System.in);
        System.out.println("The value is at "+binary_search(sc.nextInt()));
    }
}
