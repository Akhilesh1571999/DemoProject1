package com.velocity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {
//Remove duplicates from array
	public static void main(String[] args) {
		int []a = {2,2,2,55,55,21,47,48,48};
		Set<Integer> map = new HashSet<Integer>();
		for(int i =0; i<a.length; i++) {
			map.add(a[i]);
		}
		System.out.println(map);

	}

}
