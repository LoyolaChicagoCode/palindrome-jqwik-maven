package luc.fm.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class PalindromeTables {

  @Data
  Iterable<Tuple.Tuple2<String, Boolean>> palindromeExamples() {
    return Table.of(
      Tuple.of("dad", true),
      Tuple.of("kid", false)
    );
  }

  // TODO add the other rows from palindromeTable in the lecture notes 
  // to this table

  @Property
  @FromData("palindromeExamples")
  void isPalindromeWorks(@ForAll String arg, @ForAll boolean result) {
    assertEquals(result, Palindrome.isPalindrome(arg));
  }

  // TODO test the other two palindrome checkers with the same table

  // TODO create an additional table for case-insensitive testing
  // and use it to test the other two palindrome checkers

  // TODO create an additional table for case-insensitive testing with spaces ignored
  // and use it to test the isPalindromeIgnoreCaseAndSpaces
}
