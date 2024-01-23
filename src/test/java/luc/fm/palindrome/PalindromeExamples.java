package luc.fm.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class PalindromeExamples {

  @Example
  void testRadar() {
    assertTrue(Palindrome.isPalindrome("radar"));
  }

  @Example
  void testRadarC() {
    assertFalse(Palindrome.isPalindrome("Radar"));
  }

  @Example
  void testRadarSp() {
    assertFalse(Palindrome.isPalindrome("Rad a r"));
  }

  @Example
  void testLidar() {
    assertFalse(Palindrome.isPalindrome("lidar"));
  }

  // TODO add the other rows from palindromeTable in the lecture notes 
  // as individual examples as above
}
