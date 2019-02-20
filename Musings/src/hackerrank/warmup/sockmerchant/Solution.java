package hackerrank.warmup.sockmerchant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        Arrays.sort(ar);
        int count = 0;
        for (int i=0; i < n-1; i++)
        {
        	if (ar[i] == ar[i+1])
        	{
        		count = count + 1;
        		i = i + 1;
        	}
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 9;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};

        //String[] arItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

