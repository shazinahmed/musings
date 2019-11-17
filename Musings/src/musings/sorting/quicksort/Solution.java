package musings.sorting.quicksort;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {3,4,1,9,23,1,4,-1,8};
		quickSort(intArray, 0, 8);
		for (int i=0; i<intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
		System.out.println(findKthElement(intArray, 0, 8, 1));

	}
	
	private static void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	private static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		int temp;
		for (int j=low; j<high; j++)
		{
			if (arr[j]<= pivot)
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;
		return i+1;
	}
	
	private static int findKthElement(int[] arr, int low, int high, int k)
	{
		if (k-1 > high)
		{
			return 0;
		}
		int pi = partition(arr, low, high);
		if (pi != k-1 && pi < k-1)
		{
			return findKthElement(arr, pi+1, high, k);
		}
		if (pi != k-1 && pi > k-1)
		{
			return findKthElement(arr, low, pi - 1, k);
		}
		return arr[pi];
	}
}
