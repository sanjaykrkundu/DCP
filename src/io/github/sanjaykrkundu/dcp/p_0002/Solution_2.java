package io.github.sanjaykrkundu.dcp.p_0002;

import java.util.Arrays;

public class Solution_2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	private static long[] solution(int[] arr) {
		long product = 1l;
		long[] result = new long[arr.length];
		for (int i : arr) {
			if (product == 0)
				break;
			product *= i;
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = product / arr[i];
		}
		return result;
	}

}
