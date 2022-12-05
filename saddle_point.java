//Q8
import java.util.*;
public class saddle_point
{
    int arr[][];
    int m;
    int n;
    void get_array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column");
        m=sc.nextInt();
        n=sc.nextInt();
        arr = new int[m][n];
        System.out.println("Enter the matrix");
        for(int i=0;i<m;i++){
            for(int j =0; j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    void display_mat(){
        for(int i=0;i<m;i++){
            for(int j =0; j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    void check_saddle(){
        for(int i=0;i<m;i++){
            for(int j =0; j<n;j++){
                int min= arr[i][j];
                for(int k=0; k<n; k++){
                    if(arr[i][k]<min)
                    min= arr[i][k];
                }
                if (min==arr[i][j]){
                  int max= arr[i][j];
                  for(int l=0; l<m; l++){
                    if(arr[l][j]>max)
                    max= arr[l][j];
                  }
                  if(max==arr[i][j]){
                      System.out.println("Saddle point is: "+arr[i][j]+
                                         " Row: "+i+" Column: "+j);
                  }
                }
            }
        }
    }
    void main(){
        get_array();
        display_mat();
        check_saddle();
    }
}
