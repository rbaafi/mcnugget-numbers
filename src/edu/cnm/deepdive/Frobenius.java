package edu.cnm.deepdive;

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

}
