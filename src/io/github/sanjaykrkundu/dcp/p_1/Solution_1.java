package io.github.sanjaykrkundu.dcp.p_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 3, 7);
		int k = 17;
		System.out.println(solution(list, k));

	}

	public static boolean solution(List<Integer> list, int k) {
		Set<Integer> set = new HashSet<>();
		for (Integer i : list) {
			if (set.contains(k - i))
				return true;
			set.add(i);
		}
		return false;
	}

}
