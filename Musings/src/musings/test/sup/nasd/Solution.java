package musings.test.sup.nasd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    while ((line = in.readLine()) != null) {
	      System.out.println(line);
	      String[] inputString = line.split(",");
	      List<Integer> inputList = new ArrayList<Integer>();
	      for (String string : inputString)
	      {
	    	  inputList.add(Integer.parseInt(string));
	      }
	      Collections.sort(inputList);
	      int count = 0;
	      for (int i=0; i<inputList.size(); i++)
	      {
	    	  int sum = inputList.get(i);
	    	  if (sum == 0)
	    	  {
	    		  count++;
	    		  continue;
	    	  }
	    	  for (int j=inputList.size() - 1; j==0; j--)
	    	  {
	    		  if (j<i)
	    		  {
	    			  break;
	    		  }
		    	  sum = sum + inputList.get(j);
		    	  if (sum == 0) {
		    		  count++;
		    		  break;
		    	  }
	    	  }
	      }
	      System.out.println(count);
	    }
	}

}
