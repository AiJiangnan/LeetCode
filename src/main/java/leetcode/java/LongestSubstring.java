package leetcode.java;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {

    /**
     * Solution 1
     */
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<Character>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch))
                return false;
            set.add(ch);
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for (int i = 0, n = s.length(); i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j))
                    ans = Math.max(ans, j - i);
        return ans;
    }

    /**
     * Solution 2
     */
    // public static int lengthOfLongestSubstring(String s) {
    //     int ans = 0, i = 0, j = 0;
    //     int n = s.length();
    //     Set<Character> set = new HashSet<Character>();
    //     while (i < n && j < n) {
    //         if (!set.contains(s.charAt(j))) {
    //             set.add(s.charAt(j++));
    //             ans = Math.max(ans, j - i);
    //         } else
    //             set.remove(s.charAt(i++));
    //     }
    //     return ans;
    // }

    /**
     * Solution 3
     */
    // public static int lengthOfLongestSubstring(String s) {
    //     int ans = 0, n = s.length();
    //     int[] index = new int[128];
    //     for (int i = 0, j = 0; j < n; j++) {
    //         i = Math.max(index[s.charAt(j)], i);
    //         ans = Math.max(ans, j - i + 1);
    //         index[s.charAt(j)] = j + 1;
    //     }
    //     return ans;
    // }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }

}