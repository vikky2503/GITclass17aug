package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Set {
public static void main(String[] args) {
	TreeSet<Integer> s= new TreeSet<Integer>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(60);
	s.add(100);
	System.out.println(s);
	TreeSet<Integer> s1= new TreeSet<Integer>();
	s1.add(100);
	s1.add(200);
	s1.add(300);
	s1.add(400);
	s1.add(500);
	s1.add(600);
	s1.add(700);
	s1.add(8000);
	
	System.out.println(s1);
	
	s.removeAll(s1);
	System.out.println(s);
	
	
}
}

