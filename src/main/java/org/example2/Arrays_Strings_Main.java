package org.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//strings are immutable
//arrays are mutable, With arrays, we map indices to values.

public class Arrays_Strings_Main {

    public static void main(String[] args) {

        Algorithms obj = new Algorithms();
        obj.i = 5;
        obj.j = 6;

// shallow copy (copy of reference) 2 references in stack pointing to same object in heap obj=101 obj1=101
        Algorithms obj1 = obj;
        obj = null;
//        obj.i = 1000;

//        System.out.println(obj.toString()); //Algorithms{codes=null, i=1000, j=6}   null
        System.out.println(obj1.toString()); // Algorithms{codes=null, i=1000, j=6}   Algorithms{codes=null, i=5, j=6}


        Algorithms codesObject = new Algorithms(new int[]{1, 3, 4});
        codesObject.getNums(codesObject.codes);
// if array has fixed length n=> for loop iterates n times => O (n)
        Integer[] nums = new Integer[]{2, 3, 4};
        for (int n : nums) {
            System.out.println(n);
        }
// => O (n2) because we perform print and multiplication (O n * n)
        for (int num : nums) {
            for (int num2 : nums) {
                System.out.println(num * num2);
            }
        }
// => O(n2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.println(nums[i] + nums[j]);
            }
        }

//        printNumsRecursively(1);
//        checkPalindrome("racecar");
        combineArrays(new int[]{20, 40}, new int[]{10, 50});
//        isSubSequence("ace", "abcde");
//        reverseString(new char [] {'r','o','s','e'});
//        twoSumByTarget(new int[]{2,3,4,7,8}, 7);
//        findLongestSubArray(new int[]{7,2,4,1,6}, 10);
//        maxSubarraySum(new int[]{5,7,2,4,6,9}, 3);
//        longestOnes(new int[]{0,1,1,1,0,1,1,1,1,1,0,1},2);
//        lengthOfLongestSubstringTwoDistinct(new String("eceba"));
    }
// Recursion
    public static void printNumsRecursively(int num) {
        if (num > 3) return;
        System.out.println(num);
        printNumsRecursively( num + 1);

        System.out.println(" End of line where num = " + num);
    }
    // 2 pointers O(n)
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() -1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static List<Integer> combineArrays (int[] arr1, int[] arr2) { //combineArrays(new int[]{20, 40}, new int[]{10, 50});
        List<Integer> arr3 = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3.add(arr1[i]);
                i++;
            } else {
                arr3.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            arr3.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            arr3.add(arr2[j]);
            j++;
        }
        return arr3; // [10 20 40 50]
    }

    public static boolean isSubSequence (String s1, String s2) {
        //(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i ++;
            }
            j++;
        }
        return i == s1.length();
    }

    public static void reverseString(char[] s) { // new char [] {'r','o','s','e'} => esor
        int left = 0;
        int right = s.length -1;

        while(left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
        System.out.println(s);
    }

    public static int twoSumByTarget(int[] nums, int target) { //twoSumByTarget(new int[]{2,3,4,7,8}, 7); 3,4
        int left =0;
        int right = nums.length -1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return nums[left] + nums[right];
            }
            if (nums[left] + nums[right] > target) {
                right --;
            } else {
                left ++;
            }
        }
        return left;
    }


    // Sliding window
    public static int findLongestSubArray(int[] nums, int target) { //    findLongestSubArray(new int[]{7,2,4,1,6}, 10) = 3
     //  the length of the longest subarray with a sum less than or equal to target (10 here);
        int left = 0;
        int curr = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > target) {
                curr -= nums[left];
                left++;
            }
            max = Math.max(max, right - left + 1);;
        }
        return  max;
    }
    public static int maxSubarraySum(int[] nums, int k) { //maxSubarraySum(new int[]{5,7,2,4,6,9}, 3); 19
  // find the sum of the subarray with the largest sum whose length is k;
        int curr = 0;

        for (int i=0; i<k; i++) {
            curr+= nums[i];
        }
        int max = curr;
        for (int i=k; i<nums.length; i++) {
            curr += nums[i] - nums[i - k];
            max = Math.max(max, curr);
        }
        return max;
    }

//    function findMaxProfitOf2(prices,n) {
//        var tempSum =0
//        var maxSum = 0
//        for (var i=0; i<n; i++){
//            maxSum += prices[i]
//        }
//        tempSum = maxSum
//        for (var i= n; i<prices.length; i++) {
//            tempSum += prices[i] - prices[i -n]
//            if (tempSum > maxSum) {
//                maxSum = tempSum
//            }
//        }
//        return maxSum
//    }
//console.log(findMaxProfitOf2([1000,20,6,3,50],2)) // 1020
    public static int longestOnes(int[] nums, int k) { // longestOnes(new int[]{0,1,1,1,0,1,1,1,1,1,0,1},2);=> 5
       // Given a binary array nums and an integer k, return the maximum number of consecutive 1's
        int left = 0;
        int temp = 0;
        int max = 0;

        for(int right=0; right<nums.length; right++) {
            if (nums[right] == 0) {
                left ++;
                temp = 0;
            } else {
                temp+=1;
            }
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }
    public static int lengthOfLongestSubstringTwoDistinct(String s) { //"eceba" => 3
        //Given a string s, return the length of the longest substring that contains at most two distinct characters.
        int n = s.length();
        if (n < 3) return n;

        // sliding window left and right pointers
        int left = 0;
        int right = 0;
        // hashmap character -> its rightmost position
        // in the sliding window
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

        int max_len = 2;

        while (right < n) { // 0 < 5
            // when the slidewindow contains less than 3 characters
            hashmap.put(s.charAt(right), right++);

            // slidewindow contains 3 characters
            if (hashmap.size() == 3) {
                // delete the leftmost character
                int del_idx = Collections.min(hashmap.values());
                hashmap.remove(s.charAt(del_idx));
                // move left pointer of the slidewindow
                left = del_idx + 1;
            }

            max_len = Math.max(max_len, right - left);
        }
        return max_len;
    }
}
