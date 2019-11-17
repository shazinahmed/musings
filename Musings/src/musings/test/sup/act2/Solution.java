package musings.test.sup.act2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] A = new int[] {9,7,8,8,1,9,9,2,10,7,8};
		System.out.println(solution(A));

	}

    public static int solution(int[] A) {
        // write your code in Java SE 8
    	int maxTurbulance = 1;
    	if (A.length == 1) {
    		return maxTurbulance;
    	}
    	int turbulance = 1;
    	boolean lastMoveIsDescend = false;
    	boolean lastMoveIsAscend = false;
    	for (int i=1; i<A.length; i++) {
    		if (A[i] == A[i-1]) {
    			turbulance = 1;
    			lastMoveIsAscend = false;
    			lastMoveIsDescend = false;
    			continue;
    		}
    		if (A[i] < A[i-1]) {
    			if (lastMoveIsDescend) {
    				turbulance = 2;
    			}
    			else {
    				lastMoveIsDescend = true;
    				turbulance++;
    				if (maxTurbulance < turbulance) {
    					maxTurbulance = turbulance;
    				}
    			}
    			lastMoveIsAscend = false;
    			continue;
    		}
    		else {
    			if (lastMoveIsAscend) {
    				turbulance = 2;
    			}
    			else {
    				lastMoveIsAscend = true;
    				turbulance++;
    				if (maxTurbulance < turbulance) {
    					maxTurbulance = turbulance;
    				}
    			}
    			lastMoveIsDescend = false;
    		}
    		
    	}
    	return maxTurbulance;
    }
}
