package io.zipcoder;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your string to test if it can be made into a palindrome?");
        String input = scan.nextLine();
        System.out.println("Can your string be a palindrome?");
        Problem4 problem4 = new Problem4();
        System.out.println(problem4.hasPalindrome(input));
    }

    public String hasPalindrome(String input) {
        HashMap<Character, Integer> numChars = countNumberOfEachCharacter(input);

        if(canBePalindrome(numChars)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

    public HashMap<Character, Integer> countNumberOfEachCharacter(String input) {
        HashMap<Character, Integer> numChars = new HashMap<Character, Integer>();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(numChars.containsKey(c)) {
                numChars.put(c, numChars.get(c) + 1);
            }
            else {
                numChars.put(c, 1);
            }
        }
        return numChars;
    }

    public boolean canBePalindrome(HashMap<Character, Integer> numChars) {
        int numOddCounts = 0;
        for(char c : numChars.keySet()) {
            if(numChars.get(c) % 2 != 0) {
                numOddCounts++;
            }
            if(numOddCounts > 1) {
                return false;
            }
        }
        return true;
    }
}
