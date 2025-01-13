package luc.fm.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class TestPalindromeProperties {

  // example: all strings of length 1 are palindromes
  @Property
  boolean allSingleCharStringsArePalindromes(@ForAll @StringLength(1) final String s) {
    return Palindrome.isPalindrome(s);
  }

  // TODO define various properties here

  // TODO property stating that all strings of length 2 
  // consisting of the same repeated character are palindromes

  // TODO property stating that a string of length <= 5 is a palindrome
  // iff it is equal to its reverse (see lecture notes)

  // TODO extra credit: see README
}
