package shazinltc.warmup.repeatedstring;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	int stringLength = s.length();
    	long times = n/stringLength;
    	int remainder = (int) (n%stringLength);
    	long rep = s.chars().filter(c -> c=='a').count();
    	long totalTimes = rep * times;
    	String leftover = s.substring(0, remainder);
    	rep = leftover.chars().filter(c -> c=='a').count();
    	return totalTimes + rep;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "aba";

        long n = 10L;
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

