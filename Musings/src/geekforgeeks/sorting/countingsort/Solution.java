package geekforgeeks.sorting.countingsort;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 4, 1, 2, 7, 5, 2};
		countingSort(arr);
	}
	
	private static void countingSort(int[] arr)
	{
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1;
		int[] count = new int[range];
		int[] output = new int[arr.length];
		//build the initial array
		for (int i=0; i<arr.length; i++)
		{
			++count[arr[i]-min];
		}
		//build the counting array
		for (int i=1; i<range; i++)
		{
			count[i]+=count[i-1];
		} 
		for (int i=0; i<arr.length; i++)
		{
			output[count[arr[i]-min]-1] = arr[i];
			--count[arr[i]-min];
		}
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = output[i];
		}
	}

}
