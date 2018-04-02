package com.infotech.client;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ClientTest1 {

	public static void main(String[] args) {
		ConcurrentNavigableMap<String, String> cityMap = new ConcurrentSkipListMap<String, String>();
		cityMap.put("ND", "New Delhi");
		cityMap.put("MU", "Mumbai");
		cityMap.put("CH", "Chennai");
		cityMap.put("HD", "Hyderabad");
		Set<Map.Entry<String, String>> citySet = cityMap.entrySet();
		citySet.forEach((m) -> System.out.println("key " + m.getKey() + " value " + m.getValue()));
	}
}
