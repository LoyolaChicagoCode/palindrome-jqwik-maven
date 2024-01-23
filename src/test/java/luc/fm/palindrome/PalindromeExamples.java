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

  // TODO add various other individual positive and negative 
  // examples based on radar, lidar, abba, and appl
  // and testing all three palindrome checkers
}
