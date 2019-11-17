package musings.test.cd;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	private static final String DELIMITER_SPACE = " ";

	public static void main(String[] args) {
		System.out.println(common("abcdeee Fgh", "efghe fgh"));

	}
	
    public static String reverse(String str) {
    	String[] wordArray = str.split(DELIMITER_SPACE);
    	StringBuilder builder = new StringBuilder();
    	for (int i=wordArray.length-1; i>=0; i--)
    	{
    		builder.append(wordArray[i]);
    		if (i != 0)
    		{
    			builder.append(DELIMITER_SPACE);
    		}
    	}
    	return builder.toString();
    }
    static String common(String str1, String str2) {
        //The comparison is case sensitive and considers whitespace as a character
        //This can be modified if required
    	
    	//Get unique characters of str1
    	Set<Character> characterSet1 = new HashSet<Character>();
    	char[] string1CharArray = str1.toCharArray();
    	for (char character : string1CharArray)
    	{
    		characterSet1.add(character);
    	}
    	//Get unique characters of str2
    	Set<Character> characterSet2 = new HashSet<Character>();
    	char[] string2CharArray = str2.toCharArray();
    	for (char character : string2CharArray)
    	{
    		characterSet2.add(character);
    	}
    	//Find common characters
    	StringBuilder commonCharacters = new StringBuilder();
    	for (Character character : characterSet2)
    	{
    		if (characterSet1.contains(character))
    		{
    			commonCharacters.append(character);
    		}
    	}
    	return commonCharacters.toString();
    }
}
