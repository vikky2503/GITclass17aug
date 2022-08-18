package org.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class List {
public static void main(String[] args) {
	ArrayList<Integer> L= new ArrayList<Integer>();
	L.add(10);
	L.add(20);
	L.add(30);
	L.add(90);
	L.add(40);
	L.add(60);
	L.add(50);
	L.add(70);
	
	ArrayList<Integer> K= new ArrayList<Integer>();
	K.add(10);
	K.add(20);
	K.add(60);
	K.add(40);
	K.add(50);
	K.add(40);
	K.add(90);
	K.add(70);
	K.add(3000);
	
	L.removeAll(K);
	System.out.println("remove common values from L : "+L);
//	K.removeAll(L);
//	System.out.println("remove common values from K : "+K );
//	
	
}
}







