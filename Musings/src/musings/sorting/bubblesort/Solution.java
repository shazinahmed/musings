package musings.sorting.bubblesort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	int count = 0;
    	int swaps = 0;
    	for (int i=1; i<a.length; i++)
    	{
    		boolean swapped = false;
    		for (int j=0; j<a.length - i; j++)
    		{
    			if (a[j] > a[j+1])
    			{
    				int temp = a[j];
    				a[j] = a[j+1];
    				a[j+1] = temp;
    				swapped = true;
    				swaps++;
    			}
    			count++;
    		}
    		if (!swapped)
    		{
    			break;
    		}
    	}
    	System.out.println(count);
    	System.out.println("Array is sorted in "+swaps+" swaps.");
    	System.out.println("First Element: "+a[0]);
    	System.out.println("Last Element: "+a[a.length-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[] {1, 8, 12, 4, 9, 234, 301, 302, 303};

//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }

        countSwaps(a);

        //scanner.close();
    }
}
