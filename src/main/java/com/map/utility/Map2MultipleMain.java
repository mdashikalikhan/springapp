package com.map.utility;

import java.util.Arrays;

public class Map2MultipleMain {

	public static void main(String[] args) {
		Map2Multiple maps = new Map2Multiple();
		
		maps.puStringList("A", Arrays.asList("Apple", "Aeroplane", "Army"));
		maps.puStringList("A", Arrays.asList("Angry", "Aeroplane", "Army"));
		
		System.out.println(maps.getStringList("A"));
		
		maps.putMultiMap("B", "Banana");
		maps.putMultiMap("B", "Bat");
		maps.putMultiMap("B", "Ball");
		maps.putMultiMap("B", "Ballon");
		maps.putMultiMap("C", "Cat");
		maps.putMultiMap("C", "Car");
		maps.putMultiMap("C", "Canada");
		
		System.out.println(maps.getMultiMap("Z"));
		
		maps.printAllMapList();
		maps.printAllMultiMap();

	}

}