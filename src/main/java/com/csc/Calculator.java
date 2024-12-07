package com.csc;

public class Calculator {

  public int maximumUsingForLoop(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int minimumUsingForLoop(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }

  public int sumUsingForLoop(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }

  public double averageUsingForLoop(int[] nums) {
    return (double) sumUsingForLoop(nums) / nums.length;
  }

  public int maximumUsingStream(int[] nums) {
    return java.util.Arrays.stream(nums)
                          .max()
                          .getAsInt();
  }

  public int minimumUsingStream(int[] nums) {
    return java.util.Arrays.stream(nums)
                          .min()
                          .getAsInt();
  }

  public int sumUsingStream(int[] nums) {
    return java.util.Arrays.stream(nums)
                          .sum();
  }

  public double averageUsingStream(int[] nums) {
    return java.util.Arrays.stream(nums)
                          .average()
                          .getAsDouble();
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.maximumUsingForLoop(new int[] { 1, 2, 3, 4, 5 }));
  }
}