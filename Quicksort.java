import java.util.Scanner;
public class Quicksort {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int f=0;
        int l=n-1;
        sort(a, f, l);
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
    public static void sort(int a[], int f, int l) 
    {
        if(f<l)
  {
    int pos=partition(a,f,l);
    sort(a,f,pos-1);
    sort(a,pos+1,l);
  }
    }
    public static int partition(int a[], int f, int l) 
    {
        int pivot=a[l];
        int i,j;
  i=f-1;
  for(j=f;j<=l-1;j++)
  {
    if(pivot>=a[j])
    {
                    i=i+1;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
    }
  }
  
  
        i=i+1;
        int temp=a[i];
        a[i]=a[l];
        a[l]=temp;
        return i;
        
    }
    
}
