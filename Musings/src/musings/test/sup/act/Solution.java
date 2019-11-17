package musings.test.sup.act;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(30);
	}
	
    public static void solution(int N) {
        // write your code in Java SE 8
    	StringBuilder builder = new StringBuilder();
    	boolean divisible = false;
    	for (int i=1; i<=N; i++) {
    		if (i%2 == 0) {
    			builder.append("Codility");
    			divisible = true;
    		}
    		if (i%3 == 0) {
    			builder.append("Test");
    			divisible = true;
    		}
    		if (i%5 == 0) {
    			builder.append("Coders");
    			divisible = true;
    		}
    		if (divisible) {
    			System.out.println(builder.toString());
    			divisible = false;
    			builder = new StringBuilder();
    		}
    		else {
    			System.out.println(i);
    		}
    	}
    }

}
