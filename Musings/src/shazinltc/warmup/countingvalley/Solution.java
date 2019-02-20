package shazinltc.warmup.countingvalley;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	char[] steps = s.toCharArray();
    	int currentLevel = 0;
    	int count = 0;
    	for (int i=0; i<steps.length; i++)
    	{
    		if (steps[i] == 'U')
    		{
    			currentLevel++;
    		}else
    		{
    			currentLevel--;
    		}
    		if (steps[i] == 'U' && currentLevel == 0)
    		{
    			count++;
    		}
    	}
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 8;
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = "UDDDUDUU";

        int result = countingValleys(n, s);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

