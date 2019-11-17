package musings.sorting.maximumtoys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
    	int totalPrice = 0;
    	int totalCount =0;
    	Arrays.sort(prices);
    	for (int i=0; i<prices.length; i++)
    	{
    		if (prices[i] + totalPrice > k)
    		{
    			break;
    		}
    		totalCount++;
    		totalPrice = totalPrice + prices[i];
    	}
    	return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);

        int k = 50;

        int[] prices = new int[] {1,12, 5, 111, 200, 1000, 10};

//        String[] pricesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int pricesItem = Integer.parseInt(pricesItems[i]);
//            prices[i] = pricesItem;
//        }

        int result = maximumToys(prices, k);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

