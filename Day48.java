import java.util.Scanner;
class Day48
{
 static int removeDup(int arr[], int n)
 {
 if (n==0 || n==1)
 return n;
 int j = 0;
 for (int i=0; i<n-1; i++)
 if (arr[i] != arr[i+1])
 arr[j++] = arr[i];
 arr[j++] = arr[n-1];
 return j;
 }
 public static void main (String[] args)
 {
 int n;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of the array: ");
 n = sc.nextInt();
 int[]arr = new int[n];
 System.out.println("Enter the array elements: ");
 for(int i = 0; i < n; i++)
 {
 arr[i] = sc.nextInt();
 }
 int s = removeDup(arr, n);
 for (int i=0; i<s; i++)
 System.out.print(arr[i]+" ");
 }
}

