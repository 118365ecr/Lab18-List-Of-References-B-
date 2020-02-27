//Name: Dominic Feliton
//Date: 2/26/20
//Per: 2
//AP Comp Sci

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class WordsRunner
{
	public static void main( String args[] )
	{
		Words test = new Words("one two three four five six seven alligator");
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		out.println("shortest word(s): " + test.getShortestWord());
		out.println("longest word(s): " + test.getLongestWord());
		int vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
		
		test = new Words("fun fly four six times ten plus eight");
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		out.println("shortest word(s): " + test.getShortestWord());
		out.println("longest word(s): " + test.getLongestWord());
		vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");

		test = new Words("alligator chicken dog cat pig buffalo");
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 9 chars = "+test.countWordsWithXChars(9));
		out.println("shortest word(s): " + test.getShortestWord());
		out.println("longest word(s): " + test.getLongestWord());
		vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
	}
}