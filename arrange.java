//Q7
import java.util.*;
public class arrange
{
  int arr[];
  int sorted[];
  int size;  
  arrange(int n){
      size = n;
      arr=new int[size];
      sorted= new int[size];
  } 
  void input(){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the array");
      for(int i=0; i<size; i++){
          arr[i]=sc.nextInt();
      }
  }
  void Arrange(){
      int temp=0;
      for (int i = 0; i < (size - 1); i++) {
            for (int j = 0; j < (size - i - 1); j++) {
              if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;}
            }
        }
      int c=0;
      sorted[((size+1)/2)-1]=arr[c++];
      for(int i= 1; i <= (size-1)/2; i++){
          sorted[((size+1)/2)-i-1]= arr[c++];
          sorted[((size+1)/2)+i-1]= arr[c++];
      }
  }
  void display(){
      System.out.println("Before arrangement");
      for(int i=0; i<size; i++){
          System.out.println(arr[i]);
      }
      System.out.println("After arrangement");
      Arrange();
      for(int i=0; i<size; i++){
          System.out.println(sorted[i]);
      }
  }
  void main(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size");
      int n = sc.nextInt();
      input();
      display();
  }
}
