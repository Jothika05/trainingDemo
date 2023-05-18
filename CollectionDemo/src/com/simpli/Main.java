package com.simpli;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List Demo
		List<String> cityList = new ArrayList<String>();

		cityList.add("Bangalore");
		cityList.add("Delhi");
		cityList.add("Vishakapatinam");
		cityList.add("Patna");

		// Navigate and print each element of the list
		System.out.println("List of cities in cityList using simplied for loop \n");
		for (String city : cityList) {
			System.out.println(city);
		}

		// Method 2
		System.out.println("\n List of cities in cityList using for loop index \n");
		for (int i = 0; i < cityList.size(); i++) {
			System.out.println(cityList.get(i));
		}

		// Method 3
		System.out.println("\n List of cities in cityList using iterator \n");
		Iterator<String> it = cityList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

// LinkedList based cities collection demo
			List<String> cityLinkedList = new LinkedList<String>();
			System.out.println("\n LinkedList  Demo: \n");

			Scanner sc = new Scanner(System.in);
			//System.out.print("Enter a city : ");
			////String tempCity = sc.next();
			//cityLinkedList.add(tempCity);

			cityLinkedList.add("Bangalore");
			cityLinkedList.add("Delhi");
			cityLinkedList.add("Vishakapatinam");
			cityLinkedList.add("Patna");

			// Navigate and print each element of the listArrayList
			System.out.println("List of cities in cityLinkedList using simplied for loop \n");
			for (String city : cityLinkedList) {
				System.out.println(city);
			}

			// Method 2
			System.out.println("\n List of cities in cityLinkedList using for loop index \n");
			for (int i = 0; i < cityLinkedList.size(); i++) {
				System.out.println(cityLinkedList.get(i));
			}

			// Method 3
			System.out.println("\n List of cities in cityLinkedList using iterator \n");
			Iterator<String> it2 = cityLinkedList.iterator();
			while (it2.hasNext()) {
				System.out.println(it2.next());
			}
			// Set demo
			// creating hashset
			System.out.println("\n");
			System.out.println("HashSet Demo ");
			HashSet<Integer> setOfNumbers = new HashSet<Integer>();
			setOfNumbers.add(101);
			setOfNumbers.add(103);
			setOfNumbers.add(102);
			setOfNumbers.add(104);

			// Navigate and print each element of the listArrayList
			System.out.println("List of numbers in setOfNumbers using simplied for loop \n");
			for (int num : setOfNumbers) {
				System.out.println(num);
			}
			
			
			// Map demo
			System.out.println("\n\n Map demo");
			Map<String, Integer> weatherMap = new HashMap<String, Integer>();
			weatherMap.put("Delhi", 45);
			weatherMap.put("Jaipur", 33);
			weatherMap.put("Pune", 56);
			weatherMap.put("Bhopal", 34);

			System.out.println(" Pune has temerature : " + weatherMap.get("Pune"));

			System.out.println("\nThe elements of Hashmap are ");
			for (Map.Entry m : weatherMap.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
			
			// TRY the above map using TreeMap
			System.out.println("\n\n Map demo");
			Map<String, Integer> weatherMap1 = new TreeMap<String, Integer>();
			weatherMap1.put("Delhi", 45);
			weatherMap1.put("Jaipur", 33);
			weatherMap1.put("Pune", 56);
			weatherMap1.put("Bhopal", 34);

			System.out.println(" Pune has temerature : " + weatherMap1.get("Pune"));

			System.out.println("\nThe elements of Treemap are ");
			for (Map.Entry m : weatherMap1.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}

		}

	}
}