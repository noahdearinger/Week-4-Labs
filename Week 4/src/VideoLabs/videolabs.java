package VideoLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class videolabs {
	
	//finds the smallest string in a list
	public static String takeShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if(string.length() < shortest.length()) {
				shortest = string;
			}
		}
		 return shortest;
	}
	//swaps first and last elements of a list
	public static List<String> switchFirstAndLastElements(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
	}
	//concatenates all list elements together separated by a comma
	public static String concatenateItems(List<String> strings) {
		StringBuilder result = new StringBuilder();
		for(String string : strings) {
			result.append(string + ", ");
		}
		return result.toString();
	}
	//searches a list if it contains a string
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if(string.contains(query)) {
				results.add(string);
			}
		}
		return results;
	}
	//
	public static List<List<Integer>> isDivisible(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		for(Integer number : list) {
			if(number % 2 == 0) {
				results.get(0).add(number);
			}if(number % 3 == 0) {
				results.get(1).add(number);
			}if(number % 5 == 0) {
				results.get(2).add(number);
			}if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}
		return results;
	}
	
	public static List<Integer> findLengthOfString(List<String> list) {
	List<Integer> lengths = new ArrayList<Integer>();
	for(String string : list) {
		lengths.add(string.length());
	}
	return lengths;
	}
	
	public static Set<String> findBeginningCharacter(Set<String> set, char a) {
		Set<String> result = new HashSet<String>();
		for(String string : set) {
			if(string.charAt(0) == a) {
				result.add(string);
			}
		}
		return result;
	}
	
	public static List<String> convertSetToString(Set<String> set) {
		List<String> list = new ArrayList<String>();
		
		for(String string : set) {
			list.add(string);
		}
		return list;
	}
	
	public static Set<Integer> isEven(Set<Integer> set) {
		Set<Integer> result = new HashSet<Integer>();
		for(Integer number : set) {
			if(number % 2 == 0) {
				result.add(number);
			}
		}
		return result;
	}
 	public static String lookupValue(Map<String, String> map, String string) {
 		for(String key : map.keySet()) {
 			if(key.equals(string)) {
 				return map.get(key);
 			}
 		}
 		return "";
 	
 	}
	
 	public static Map<Character, Integer> countStartingLetters(List<String> list) {
 		Map<Character, Integer> result = new HashMap<Character, Integer>();
 		
 		for(String string : list) {
 			char c = string.charAt(0);
 			if (result.get(c) == null) { //if character isnt in map, add it to map
 				result.put(c, 1);
 			}else {						 //if character IS in map, next fucntion adds to total
 				result.put(c, result.get(c)+ 1);
 			}
 		}
 		
 		return result;
 	}
 	
 	
 	
 	
	public static void main(String[] args) {

		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 10; i++) {
			sb.append(i);
			if (i != 9) { 
				sb.append("-");
			}
		}
		System.out.println(sb.toString());

		List<String> games = new ArrayList<String>();
		
		games.add("Call Of Duty");
		games.add("Skyrim");
		games.add("Forza");
		games.add("Oblivion");
		games.add("COD Zombies");
		
	System.out.println(takeShortestString(games));
	
	//System.out.println(switchFirstAndLastElements(games));
	
	System.out.println(concatenateItems(games));
	
	List<String> searchResults = search(games, "a");
	for(String result : searchResults) {
		System.out.println(result + ", ");
	}
	
	List<Integer> numbers = Arrays.asList(12, 15, 42, 96, 105, 240, 31, 1032474);
	List<List<Integer>> sortedNumbers = (isDivisible(numbers));
	
	for (List<Integer> list : sortedNumbers) {
		for(Integer number : list) {
			System.out.println(number);
		}
		System.out.println("Next List --------");
	}
	
	List<Integer> gamesLengths = findLengthOfString(games);
	for(Integer i : gamesLengths) {
		System.out.print(i + ", ");
	}
	
	Set<String> boardGames = new HashSet<String>();
	boardGames.add("Seven Wonders");
	boardGames.add("Pandemic");
	boardGames.add("Monopoly");
	boardGames.add("Risk");
	boardGames.add("Card Games");
	
	System.out.println("");
	
	List<String> resultList = convertSetToString(boardGames);
	
	for(String listString : resultList) {
	System.out.println(listString);
	}
	
	
	Set<String>	startsWithM = findBeginningCharacter(boardGames, 'M');
	for(String word : startsWithM) {
		System.out.println(word);
	}
	
	Set<Integer> num = new HashSet<Integer>();
	num.add(1);
	num.add(4);
	num.add(88);
	num.add(104);
	num.add(21);
	num.add(44);
	Set<Integer> evenNumbers = isEven(num);
	System.out.println(evenNumbers); 
	
	
	Map<String, String> dictionary = new HashMap<String, String>();
	
	dictionary.put("car", "a vehicle that uses an engine");
	dictionary.put("electric car", "a vehicle that uses a battery pack in lieu of an engine");
	dictionary.put("horse", "a vehicle that is an animal");
	
	String value = lookupValue(dictionary, "car");
	System.out.println(value);
	
	
	Map<Character, Integer> counts = countStartingLetters(resultList);
	for(Character character : counts.keySet()) {
		System.out.println(character + " - " + counts.get(character));
	}
	
	
	
	
	
	
	
	}
}