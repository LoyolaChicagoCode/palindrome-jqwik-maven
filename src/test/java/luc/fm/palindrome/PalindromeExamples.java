package luc.fm.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class PalindromeExamples {

  @Example
  boolean testRadar() {
    return Palindrome.isPalindrome("radar");
  }

  @Example
  boolean testRadarC() {
    return !Palindrome.isPalindrome("Radar");
  }

  @Example
  boolean testRadarSp() {
    return !Palindrome.isPalindrome("Rad a r");
  }

  @Example
  void testLidar() {
    assertFalse(Palindrome.isPalindrome("lidar"));
  }

  // TODO add various other individual positive and negative 
  // examples based on radar, lidar, abba, and appl
  // and testing all three palindrome checkers -
  // TODO aim for a total of 20 examples including those above
}
