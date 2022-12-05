//Q_3
import java.util.*;
public class Numbers
{
    int N;
    int Num;
    int Prev;
    int Arr[][];
    Numbers(int a, int b){
        N=a;
        Num=b;
        Arr= new int[N][N];
    }
    Numbers check(int n){
        int v=0,c=1,flag=0;
        while(n>v){
            v=c*(c+1)/2;
            if(n==v){
                flag=1;
                break;
            }
            c++;
        }
        if(flag==0){
            n=v;
        }
        Prev = c;
        Numbers obj= new Numbers(N,n);
        return obj;
    }
    void display(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
    }
}