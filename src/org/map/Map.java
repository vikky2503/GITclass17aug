package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
public static void main(String[] args) {
	Hashtable<String, String> m= new Hashtable<String,String>();
	m.put("vel", "selenium");
	m.put("ganesh", "framework");
	m.put("dinesh", "oracle");
	m.put("vengat", "java");
	m.put("subash", "jira");
	
	System.out.println(m.keySet());
	System.out.println(m.values());
	Set<Entry<String, String>> e = m.entrySet();
	for (Entry<String, String> entry : e) {
		
	}
	System.out.println(e);
}
}
