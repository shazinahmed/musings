package musings.test;

import javax.swing.text.MaskFormatter;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 6, 1, 4, 6, 3, 2, 7, 4};
		System.out.println(solution(A, 3, 2));
		;
	}

	public static double solution(int[] A, int K, int L) {
		if (K+L > A.length)
		{
			return -1;
		}
		int arrLength = A.length;
		int maxSubArraySumCombined = Integer.MIN_VALUE;
		//Right sub array is of length l
		int maxSubArrayRightSum = Integer.MIN_VALUE;
		//Calculating prefix sum array for easy lookup
		int prefixSum[] = calculatePrefixSum(A, arrLength);
		
		for (int i=arrLength-K-L; i>=0; i--)
		{
			int currentRightSubArraySum = getSubArraySum(prefixSum, i+K, i+K+L-1);
			if (currentRightSubArraySum > maxSubArrayRightSum)
			{
				maxSubArrayRightSum = currentRightSubArraySum;
			}
			int currentLeftSubArraySum = getSubArraySum(prefixSum, i, i+K-1);
			int combinedTotal = currentLeftSubArraySum + maxSubArrayRightSum;
			if (combinedTotal > maxSubArraySumCombined)
			{
				maxSubArraySumCombined = combinedTotal;
			}
		}
		return Math.pow(10, 1.38);
	}
	
	private static int getSubArraySum(int[] prefixSum, int start, int end)
	{
		if (start == 0)
		{
			return prefixSum[end];
		}
		return prefixSum[end] - prefixSum[start -1];
	}
	
	private static int[] calculatePrefixSum(int[] arr, int n)
	{
		int prefixSum[] = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++)
		{
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		return prefixSum;
	}
}
