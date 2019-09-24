package it.cybsec;

import java.util.*;

public class Applicazione {

	static int[] array;
	static int[][] matrix; 

	static Collection<String> collection;
	
	static List<String> studenti; 
	
	static ArrayList<String> studentiArray;
	static LinkedList<String> studentiLinked;
	static Vector<String> studentiVector;
	static Stack<String> studentiStack;
	
	public static void main(String[] args) {
		
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		
//		matrix = new int[10][10];
		matrix = new int[10][];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = new int[10];
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i + j;
			}
		}
		
		studenti = new ArrayList<String>();
		
		studentiArray = new ArrayList<String>();
		studentiLinked = new LinkedList<String>();
		studentiVector = new Vector<String>();
		studentiStack = new Stack<String>();
		
		studenti.add("Mirko");
		studenti.add("Fabiano");
		studenti.add("Mauro");
		studenti.add("Michele");
		studenti.add("Tommaso");
		studenti.add("Giuseppe");
		
		for (int i = 0; i < studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
		System.out.println();
		
		for (String el: studenti) {
			System.out.println(el);
		}
		System.out.println();
		
		studenti.remove(0);
		System.out.println(studenti.size());
		studenti.remove("Michele");
		System.out.println(studenti.size());
		System.out.println();

		Iterator<String> i = studenti.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		studentiArray.addAll(studenti);
		studentiLinked.addAll(studenti);
		studentiVector.addAll(studenti);
		studentiStack.addAll(studenti);
		
		studentiLinked.addFirst("Mirko");
		studentiLinked.addLast("Marco");
		
//		Mostrare alcune esempi con:
//			- studentiLinked
//			- studentiVector
		
		studentiStack.push("Gervaso");
		System.out.println(studentiStack.size());
		System.out.println(studentiStack.pop());
		System.out.println(studentiStack.size());
		System.out.println();
		
	}

}
