//Q4
import java.util.*;
public class point
{
    int A[][];
    int R;
    int C;
    point(int p, int q){
        R=p;
        C=q;
        A = new int[R][C];
    }
    void get_array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix");
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
             A[i][j]=sc.nextInt();   
            }
        }
    }
    void display_mat(){
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
             System.out.print(A[i][j]); 
            }
            System.out.println();
        }
    }
    int check_psuedo(int a[]){
        int len = a.length;
        int x = a[0]+a[(len-1)];
        if (len%2==0){
            for(int i=0; i<(len/2); i++){
                if(a[i]+a[len-1-i] != x)
                return 0;
            }
        }
        else{
            for(int i=0; i<((len+1)/2); i++){
                if(a[i]+a[len-1-i] != x)
                return 0;
            }
        }
        return 1;
    }
    void result(){
        int aa[]= new int[C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                aa[j]=A[i][j];
            }
            if (check_psuedo(aa) ==0)
                System.out.println ("Row "+i+" not psuedo numbers");
            else
               System.out.println ("Row "+i+" psuedo numbers");
        }
    }
}
