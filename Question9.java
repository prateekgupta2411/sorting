import java.lang.reflect.Array;
 import java.util.Arrays;
 import java.util.Scanner;
 public class Question9 {

 static void sortAll(int[] profit,int[] weight,int[] profit_weight) {
 for (int i = 0; i < profit.length; i++) {
 int min = i;
 for (int j = i + 1; j < profit.length; j++) {
 if (profit_weight[j] > profit_weight[min]) {
 min = j;

 }

 }

 int temp = profit_weight[i];
 profit_weight[i] = profit_weight[min];
 profit_weight[min] = temp;
 int temp1 = profit[i];
 profit[i] = profit[min];
 profit[min] = temp1;
 int temp3 = weight[i];
 weight[i] = weight[min];
 weight[min] = temp3;

 }

 }
 static int getMaxProfit(int[] profit,int[] weight,int[] profit_weight,int capacity)
 {
 int res = 0,i;
 for(i = 0;i<profit.length;i++)
 {
 if(capacity>0 && weight[i]<=capacity)
 {
 res+=profit[i];
 capacity-=weight[i];
 }else{
 break;
 }
 }
 if(capacity>0){
 res = res+((profit[i]*capacity)/weight[i]);
 }
 return res;
 }
 static void detail()
 {
 System.out.println("Prateek Gupta");
 System.out.println("24");
 }
 public static void main(String[] args) {
 char[] item = {'A','B','C','D'};
 int[] profit = {280,100,120,120};
 int[] weight = {40,10,20,24};
 int capacity = 60;
 int[] profit_weight = new int[profit.length];
 for(int i = 0;i<profit.length;i++)
 {
 profit_weight[i] = (profit[i]/weight[i]);
 }
 sortAll(profit,weight,profit_weight);
 System.out.println("Max Profit : "+getMaxProfit(profit,weight,profit_weight,capacity));
 detail();
 }
    
}
