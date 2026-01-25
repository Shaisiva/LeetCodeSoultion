// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        // Edge case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Add all elements to HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;

        // Step 2: Find longest sequence
        for (int num : set) {

            // Start only if num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
