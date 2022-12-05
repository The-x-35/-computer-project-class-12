//Q1
import java.util.*;
public class Matrix{
 public void main(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter N");
  int N = sc.nextInt();
  int A [][]= new int[N][N];
  int c=0,x=0,y=0,z=0;
  for(int i=0; i<N; i++){
   for(int j=0; j<N; j++){
    A[i][j]=++c;}}
  for(int i=0; i<N; i++){
    for(int j=0; j<N; j++){
      System.out.print(A[i][j]+" ");}
      System.out.println();}
  System.out.println("Enter V & M");
  int V= sc.nextInt();
  int M= sc.nextInt();
  int S[][]= new int[M][M];
  for(int i=0; i<N; i++){
   for(int j=0; j<N; j++){
    if(A[i][j]==V){
     x=i;
     y=j;
     break;}}}
  for(int i=0; i<M; i++){
   z=y;
   if (x>N-1)
    x=0;
   for(int j=0; j<M; j++){
    if (y>N-1)
    y=0;
    S[i][j]=A[x][y];
    y++;}
   x++;
   y=z;}
  for(int i=0; i<M; i++){
   for(int j=0; j<M; j++){
    System.out.print(S[i][j]+ " ");}
   System.out.println();}
    }
}
