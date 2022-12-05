//Q6
import java.util.*;
public class mat
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M and N");
        int m =sc.nextInt();
        int n = sc.nextInt();
        int A[][]= new int[m][n];
        int arr[]= new int[m*n];
        int c=0;
        System.out.println("Enter the matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                A[i][j]=sc.nextInt();
                arr[c++]=A[i][j];
            }
        }
        System.out.println("Original matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        int max = A[0][0],min = A[0][0],imax=0,jmax=0,imin=0, jmin=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(A[i][j]<min)
                {min=A[i][j];
                imin=i;
                jmin=j;}
                if(A[i][j]>max){
                max=A[i][j];
                imax=i;
                jmax=j;}
            }
        }
        System.out.println("Largest number: "+ max+ " Row: "+ imax+ " Column: "+ jmax+"\n"+
                            "Smallest number: "+min+" Row: "+imin+ " Column: "+jmin);
        int temp =0;                    
         for (int i = 0; i < ((m*n) - 1); i++) {
            for (int j = 0; j < ((m*n) - i - 1); j++) {
              if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;}
            }
        }
        c=0;
        System.out.println("Rearranged matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[c++]);
            }
            System.out.println();
        }
    }
}
