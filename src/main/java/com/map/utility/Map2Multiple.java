package com.map.utility;


import java.util.HashMap;
import java.util.List;
import java.util.Map;




import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Map2Multiple {
	
	private Map<String, List<String>> mapList;
	private Multimap<String, String> multiMap;
	
	
	public Map2Multiple() {
		mapList = new HashMap<String, List<String>>();
		multiMap = ArrayListMultimap.create();
	}
	
	public void puStringList(String key, List<String> stringList) {
		mapList.put(key, stringList);
	}
	
	public List<String> getStringList(String key) {
		return mapList.get(key);
	}
	
	public void putMultiMap(String key, String value) {
		multiMap.put(key, value);
		
	}
	
	public List<String> getMultiMap(String key) {
		return (List<String>) multiMap.get(key);
	}
	
	public void printAllMapList() {
		for(Map.Entry<String,List<String>> entry : mapList.entrySet())
		{
			System.out.println("key:    " + entry.getKey());
			System.out.println("Value:    " + entry.getValue());
		}
	}
	
	public void printAllMultiMap() {
		for(String key : multiMap.keySet())
		{
			System.out.println("key:    " + key);
			System.out.println("Value:    " + multiMap.get(key));
		}
		
	}

}
