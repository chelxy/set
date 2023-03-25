package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		// LinkedHashSet<> - intermediário  e na ordem em que foram adicionados
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
}