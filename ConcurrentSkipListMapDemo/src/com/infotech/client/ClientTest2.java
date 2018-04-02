package com.infotech.client;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ClientTest2 {

	public static void main(String[] args) {
		ConcurrentNavigableMap<String, String> cityMap = new ConcurrentSkipListMap<String, String>();
		cityMap.put("ND", "New Delhi");
		cityMap.put("MU", "Mumbai");
		cityMap.put("CH", "Chennai");
		cityMap.put("HD", "Hyderabad");
		System.out.println("-------- Traversing the map --------");
		Set<Map.Entry<String, String>> citySet = cityMap.entrySet();
		// using for-each loop in Java 8
		citySet.forEach((m) -> System.out.println("key " + m.getKey() + " value " + m.getValue()));

		NavigableSet<String> reverseKeys = cityMap.descendingKeySet();
		// using iterator
		Iterator<String> itr = reverseKeys.iterator();
		System.out.println("------ Map keys in reverse order ---------");
		while (itr.hasNext()) {
			System.out.println("Key " + itr.next());
		}

		System.out.println("---- Floor entry-----");

		Map.Entry<String, String> tempMap = cityMap.floorEntry("II");
		System.out.println(tempMap);

		System.out.println("---- Head Map-----");
		ConcurrentNavigableMap<String, String> map = cityMap.headMap("MU");
		Set<Map.Entry<String, String>> set = map.entrySet();
		// using for-each loop in Java 8
		set.forEach((m) -> System.out.println("key " + m.getKey() + " value " + m.getValue()));

		System.out.println("---- Higher entry-----");

		tempMap = cityMap.higherEntry("II");
		System.out.println(tempMap);
	}

}
