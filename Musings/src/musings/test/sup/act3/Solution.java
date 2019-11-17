package musings.test.sup.act3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {4,6,2,2,6,6,1};
		System.out.println(solution(A));

	}
	
	public static int solution(int[] A) {
		int maxRange = 0;
		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (int i=0; i<A.length; i++) {
			if (indexMap.containsKey(A[i])) {
				maxRange = Math.max(maxRange, i - indexMap.get(A[i]));
			}
			else {
				indexMap.put(A[i], i);
			}
		}
		return maxRange;
	}

}
