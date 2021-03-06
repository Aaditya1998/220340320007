/*n=5
a1 = [1,2,4,5,3]
Start at the rightmost index. Store the value of a1[4]=3 . Compare this to each element to the left until
a smaller value is reached. Here are the results as described:
1 2 4 5 5
1 2 4 4 5
1 2 3 4 5
Function Description
Complete the insertionSort function in the editor below.
insertionSort has the following parameter(s):
n: an integer, the size of a1
a1: an array of integers to sort
Returns
Note: Print the interim and final arrays, each on a new line. No return value is expected.*/
import java.util.Scanner;
public class InsertionSort{
	void sort(int arr[]){
		for (int j=0; j<arr.length ; j++){
		int temp =  arr[j];
		int k=j-1;
		while(k>0 && arr[k]>temp){
			arr[k+1]=arr[k];
			
			k=k-1;
			System.out.print(arr[k]+" ");
		}
		arr[k+1]=temp;
	  }
	}
	void display(int[] arr){
		int m = arr.length;
		for (int l=0; l<m ;l++)
		{
			System.out.print(arr[l]+" ");
		}
		System.out.print("");
	}
	
	public static void main(String[] args){
		InsertionSort in = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
	int arr[] = new int[n];
		for (int i=0;i<arr.length;i++)
		{
		 arr[i] =sc.nextInt();
		}
		in.sort(arr);
		in.display(arr);
	}
}