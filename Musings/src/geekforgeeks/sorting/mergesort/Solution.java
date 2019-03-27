package geekforgeeks.sorting.mergesort;

import java.io.IOException;

public class Solution {
	
	public static void main(String[] args) throws IOException
	{
		int[] intArray = new int[] {3,4,1,9,23,1,4,-1,-8};
		mergeSort(intArray, intArray.length);
		for (int i=0; i<intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
		mergeSortIterative(intArray, intArray.length);
		for (int i=0; i<intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
	}

	private static void mergeSort(int[] ar, int n)
	{
		if (n < 2)
		{
			return;
		}
		int left = n/2;
		int right = n-left;
		int[] leftArr = new int[left];
		int[] rightArr = new int[right];
		for (int i=0; i<left; i++)
		{
			leftArr[i] = ar[i];
		}
		for (int j=0; j<right; j++)
		{
			rightArr[j] = ar[j+left];
		}
		mergeSort(leftArr, left);
		mergeSort(rightArr, right);
		merge(ar, leftArr, rightArr, left, right, 0);		
	}
	
	private static void merge(int[] arr, int[] left, int[] right, int l, int r, int offset) 
	{
		int i=0, j=0, k=offset;
		while (i < l && j < r)
		{
			if (left[i] >= right[j])
			{
				arr[k++] = right[j++];
			}
			else {
				arr[k++] = left[i++];
			}
		}
		while (i < l)
		{
			arr[k++] = left[i++];
		}
		while (j < r)
		{
			arr[k++] = right[j++];
		}
	}
	
	private static void mergeSortIterative(int[] ar, int n)
	{
		if (n<2)
		{
			return;
		}
		for (int k=1; k < n-1; k = k*2)
		{
			for (int i=0; i < n-k; i += 2*k)
			{
				int[] left = new int[k], right = new int[k];
				int l = 0,r = 0;
				for (int m=0; m<k; m++)
				{
					l++;
					left[m] = ar[i+m];
				}
				for (int m=0; m<k && i+k+m<n; m++)
				{
					r++;
					right[m] = ar[i+k+m];
				}
				merge(ar, left, right, l, r, i);
			}
		}
	}
}
