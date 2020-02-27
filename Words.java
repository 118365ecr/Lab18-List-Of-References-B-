//Name: Dominic Feliton
//Date: 2/26/20
//Per: 2
//AP Comp Sci

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words = new ArrayList<Word>();

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		String[] tempWordArray = wordList.split(" ");
		for (String eaWord : tempWordArray)
		{
			Word newWord = new Word(eaWord);
			words.add(newWord);
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		for (Word eaWord : words)
		{
			if (eaWord.getLength() == size)
			{
				count++;
			}
		}
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int numOfVowelsRemoved = 0;
		for (int i = words.size() - 1; i >= 0; i--)
		{
			if (words.get(i).getLength() == size)
			{
				numOfVowelsRemoved+=words.get(i).getNumVowels();
				words.remove(i);
			}
		}
		return numOfVowelsRemoved;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		for (Word eaWord : words)
		{
			if (eaWord.getNumVowels() == numVowels)
			{
				count++;
			}
		}
		return count;
	}
	
	public String getLongestWord()
	{
		String outWord = "";
		int longestSize = 0;
		for (Word eaWord : words)
		{
			if (eaWord.getLength() > longestSize)
			{
				longestSize = eaWord.getLength();
			}
		}
		
		//check for multiple longestWords
				for (Word eaWord : words)
				{
					if (eaWord.getLength() == longestSize)
					{
						outWord = outWord + eaWord.toString() + " ";
					}
				}
		return outWord;
	}
	
	public String getShortestWord()
	{
		String outWord = "";
		int smallestSize = Integer.MAX_VALUE;
		for (Word eaWord : words)
		{
			if (eaWord.getLength() < smallestSize)
			{
				smallestSize = eaWord.getLength();
			}
		}
		
		//check for multiple shortestWords
		for (Word eaWord : words)
		{
			if (eaWord.getLength() == smallestSize)
			{
				outWord = outWord + eaWord.toString() + " ";
			}
		}
		return outWord;
	}
	
	public String toString()
	{
	   String[] out = new String[words.size()];
	   for (int i = 0; i < words.size(); i++)
	   {
		   out[i] = words.get(i).toString();
	   }
	   return Arrays.toString(out);
	}
}