//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b){
    return a > b ? a : b;
  }

  public int min(int a, int b){
    return a < b ? a : b;
  }

  public int sum(int[] nums){
    int sum = 0;
    for (int n : nums){
      sum += n;
    }
    return sum;
  }

  public int average(int[] nums){
    return sum(nums)/nums.length;
  }

  public int max(int[] nums){
    int currMax = nums[0];
    for (int n: nums){
      currMax = max(currMax, n);
    }
    return currMax;
  }

  public int min(int[] nums){
    int currMin = nums[0];
    for (int n: nums){
      currMin = min(currMin, n);
    }
    return currMin;
  }
}