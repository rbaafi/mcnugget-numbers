package edu.cnm.deepdive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Frobenius {

  // pack sizes are 6, 9 and 20.
  public static boolean isMcNugget(int value) {
    //TODO Return true if value can be expressed as the sum of integral
    // multiples of the 3 original Mcnugget pack sizes; return false otherwise.
  if (value < 0) {
    return false;
  }
  if (value == 0) {
    return true;
  }
    if (isMcNugget(value - 20)) {
      return true;
    }
    if (isMcNugget(value - 9)) {
      return true;
    }
    if (isMcNugget(value - 6)) {
      return true;
    }
//  return  isMcNugget(value - 6) || isMcNugget(value - 9) || isMcNugget(value - 20);
  return false;
  }

  /**
   * Return true if the stated value can be formed as a sum of non-negative integral multiples of
   * the elements of packSizes.
   *
   * @param value target/goal number.
   * @param packSizes array of distinct, positive pack sizes, in descending order.
   * @return true if value is a McNugget number using the specific pack sizes, false otherwise.
   */
  public static boolean isGeneralMcNugget(int value, int[] packSizes) {
    boolean flag = false;
    if (packSizes.length == 1 || packSizes.length == 0) {
      if (value >= 0 && value == 0 || isGeneralMcNugget(value - packSizes[0], null));
      flag = true;
    }
    for (int i = 0; i < packSizes.length; i++) {
      int[] ithElementArray = {packSizes[i]};
      isGeneralMcNugget(value, ithElementArray);
    }
    return flag;
  }
}
