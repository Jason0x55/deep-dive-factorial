package edu.cnm.deepdive;

public class Palindrome {

  public static boolean isPalindrome (String input) {
    input = input.toLowerCase();
    input = input.replaceAll("[^a-z0-9]", "");
    return isRecursivePalindrome(input);
  }

  private static boolean isRecursivePalindrome(String input) {
//    if (input.length() <= 1) {
//      return true;
//    }
//    if (input.charAt(0) != input.charAt(input.length() - 1)) {
//      return false;
//    }
//    String middle = input.substring(1, input.length() - 1);
//    return isRecursivePalindrome(middle);
    return (
        (input.length() <= 1)
        || (
            (input.charAt(0) == input.charAt(input.length() - 1))
            && isRecursivePalindrome(input.substring(1, input.length() - 1))
            )
        );
  }

}
