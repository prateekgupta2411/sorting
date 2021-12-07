import java.util.Scanner;

public class Selectionsort{
    
   public static void main(String[] args)
   {
      int tot, i, j, count, small, index=0, x;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the Size of Array: ");
      tot = sc.nextInt();
      int[] arr = new int[tot];
      
      System.out.print("Enter " +tot+ " Elements for the Array: ");
      for(i=0; i<tot; i++)
         arr[i] = sc.nextInt();
      
      for(i=0; i<(tot-1); i++)
      {
         count=0;
         small = arr[i];
         for(j=(i+1); j<tot; j++)
         {
            if(small>arr[j])
            {
               small = arr[j];
               count++;
               index = j;
            }
         }
         if(count!=0)
         {
            x = arr[i];
            arr[i] = small;
            arr[index] = x;
         }
      }
      System.out.println("The array is sorted successfully!");
      System.out.println("Prateek Gupta");
      System.out.println("24");
      
      System.out.println("\nThe new sorted array is: ");
      for(i=0; i<tot; i++)
         System.out.print(arr[i]+ " ");
      
   }
}