package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class Problem4Test {

    Problem4 problem4;

    @Before
    public void initialize() {
        problem4 = new Problem4();
    }

    @Test
    public void hasPalindromeTest() {
        String input = "aaabbbb";

        String expected = "YES";
        String actual = problem4.hasPalindrome(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doesNotHavePalindromeTest() {
        String input = "cdefghmnopqrstuvw";

        String expected = "NO";
        String actual = problem4.hasPalindrome(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasPalindromeTest2() {
        String input = "cdcdcdcdeeeef";

        String expected = "YES";
        String actual = problem4.hasPalindrome(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countNumberOfEachCharacterTest() {
        String input = "aaabbbb";

        HashMap<Character, Integer> expected = new HashMap<Character, Integer>();
        expected.put('a', 3);
        expected.put('b', 4);

        HashMap<Character, Integer> actual = problem4.countNumberOfEachCharacter(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canBePalindromeTest() {
        HashMap<Character, Integer> input = new HashMap<Character, Integer>();
        input.put('c', 1);
        input.put('a', 4);
        input.put('t', 10);

        Assert.assertTrue(problem4.canBePalindrome(input));
    }

    @Test
    public void cannotBePalindromeTest() {
        HashMap<Character, Integer> input = new HashMap<Character, Integer>();
        input.put('c', 1);
        input.put('a', 3);
        input.put('t', 10);

        Assert.assertFalse(problem4.canBePalindrome(input));
    }
}
