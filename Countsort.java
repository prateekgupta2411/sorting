import java.util.Scanner;

class Countsort {
 
 public static void sortArray(int inputArr[])
 {
 
 int size = inputArr.length;
 int sortedArr[] = new int[size];
 int countArr[] = new int[256];
 for (int i = 0; i < 256; ++i) {
 countArr[i] = 0;
 }

 for (int i = 0; i < size; ++i)
 ++countArr[inputArr[i]];
 for (int i = 1; i <= 255; ++i)
 countArr[i] += countArr[i - 1];
 for (int i = size - 1; i >= 0; i--) {
 sortedArr[countArr[inputArr[i]] - 1] = inputArr[i];
 --countArr[inputArr[i]];
 }
 
 for (int i = 0; i < size; ++i)
 inputArr[i] = sortedArr[i];
 
 System.out.print("Sorted numbers in the array is:");
 for (int i = 0; i < inputArr.length; ++i)
 System.out.println(inputArr[i]);
 System.out.println("Prateek gupta");
 System.out.println("24");
 }

 public static void main(String args[]){

 int size;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of elements you want to store in the array: ");
 
 size = sc.nextInt();
 int[] inputArr = new int[size];
 System.out.println("Enter the elements in the array: ");
 for(int i=0; i<size; i++){
     
 inputArr[i] = sc.nextInt();
 }
 
 sc.close();
 sortArray(inputArr);
 }
}