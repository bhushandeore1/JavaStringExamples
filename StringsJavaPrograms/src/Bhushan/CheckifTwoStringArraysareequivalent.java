package Bhushan;

import java.awt.SecondaryLoop;
import java.io.Console;
import java.util.Arrays;

//
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.

//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.

public class CheckifTwoStringArraysareequivalent {

	public static void main(String[] args) {
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
		System.out.println(arrayStringsAreEqual1(word1, word2));
	}
	
	
//	first solution it is like o(n2) time complexity
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one="";
        for(int i=0;i<word1.length;i++){
            one=one+word1[i];
        }
        String two="";
        for(int j=0;j<word2.length;j++){
            two=two+word2[j];
        }
        if(one.equals(two)) {
        	return true;
        }
        else {
			return false;
		}
    }
	
//	Second approach is like we can user Stringbuilder
	public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for (String string : word1) {
			s1.append(string);
		}
        for (String string1 : word2) {
			s2.append(string1);
		}
        System.out.println(s1);
        System.out.println(s2);
        return s1.toString().equals(s2.toString());

    }

}
