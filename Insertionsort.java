
import java.util.Scanner;
public class Insertionsort {

   public static void main(String[] args)
   {
      int n, i, j, element;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the Size of Array: ");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " +n+ " Elements: ");
      for(i=0; i<n; i++)
         arr[i] = sc.nextInt();
      
      for(i=1; i<n; i++)
      {
         element = arr[i];
         
         for(j=(i-1); j>=0 && arr[j]>element; j--)
            arr[j+1] = arr[j];
         
         arr[j+1] = element;
      }
      System.out.println("The array is sorted successfully!");
      System.out.println("Prateek Gupta");
      System.out.println("24");
      
      
      System.out.println("\nThe new sorted array is: ");
      for(i=0; i<n; i++)
         System.out.print(arr[i]+ " ");
   }
}