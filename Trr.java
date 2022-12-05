//Q18
import java.util.*;
public class Trr
{
    int arr[][];
    Trr(){
        arr= new int[3][3];
    }
    void input(){
        System.out.println("Enter matrix");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    Trr transpose(){
        Trr obj=new Trr();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                obj.arr[i][j]=arr[j][i];
            }
        }
        return obj;
    }
    Trr product(Trr M){
        Trr obj= new Trr();
        Trr t= transpose();
        for(int i = 0; i < 3; i++){    
                for(int j = 0; j < 3; j++){    
                    for(int k = 0; k < 3; k++){    
                       obj.arr[i][j]+= arr[i][k] * t.arr[k][j];     
                    }    
                }    
            }    
        return obj;
    }
    void display(){
        Trr obj = transpose();
        Trr m= product(obj);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("X");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(obj.arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m.arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void main(){
        input();
        display();
    }
}
