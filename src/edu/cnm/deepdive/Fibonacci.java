package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static long recursive(int generation) {
    if (generation <= 1) {
      return 1;
    }

    return recursive(generation - 1) + recursive(generation - 2);

  }

  public static long iterative(int generation) {
    long prev2 = 1;
    long prev1 = 1;

    if (generation == 0) {
      return prev2;
    }
    if (generation == 1) {
      return prev1;
    }

    for (int i = 2; i <= generation; i++) {
      long current = prev1 + prev2;
      prev2 = prev1;
      prev1 = current;
    }
    return prev1;
  }

  public static BigInteger iterativeBigInt(int generation) {
    BigInteger prev2 = BigInteger.ONE;
    BigInteger prev1 = BigInteger.ONE;

    if (generation == 0) {
      return prev2;
    }
    if (generation == 1) {
      return prev1;
    }

    for (int i = 2; i <= generation; i++) {
      BigInteger current = prev1.add(prev2);
      prev2 = prev1;
      prev1 = current;
    }
    return prev1;
  }
}
