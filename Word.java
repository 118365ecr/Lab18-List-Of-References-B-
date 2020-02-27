//Name: Dominic Feliton
//Date: 2/26/20
//Per: 2
//AP Comp Sci

import static java.lang.System.*;

public class Word
{
    private String word;
    private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		setWord("");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
		for (int eaVow = 0; eaVow < vowels.length(); eaVow++)
		{
			for (int eaLet = 0; eaLet < word.length(); eaLet++)
			{
				if (word.substring(eaLet, eaLet + 1).equals(vowels.substring(eaVow, eaVow + 1)))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}