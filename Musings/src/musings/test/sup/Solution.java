package musings.test.sup;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2,3 };
		System.out.println(solution(a));

	}

	public static int solution(int[] A) {
		int max = Arrays.stream(A).max().getAsInt();
		if (max < 1) {
			return 1;
		}
		if (A.length == 1) {
			if (A[0] == 1)
			{
				return 2;
			}
			else {
				return 1;				
			}
		}
		int[] posArray = new int[max];
		for (int i=0; i<A.length; i++) {
			if (A[i] > 0) {
				posArray[A[i]-1] = 1;
			}
		}
		int index;
		for (index = 0; index < max; index++) {
			if (posArray[index] == 0) {
				return index + 1;
			}
		}
		return index + 1;
	}

}
