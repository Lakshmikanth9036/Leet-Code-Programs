package com.leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder ans = new StringBuilder();
		Arrays.sort(strs);
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+", ");
		}
		System.out.println();
		String first = strs[0];
		String last = strs[strs.length - 1];
		for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
			if (first.charAt(i) != last.charAt(i)) {
				return ans.toString();
			}
			ans.append(first.charAt(i));
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "flower","flow","","flight" }));
	}
}