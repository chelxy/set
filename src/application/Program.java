/* Demo1: Alguns metodos importantes*/
package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3); Predicados
		set.removeIf(x -> x.charAt(0) == 'T');//Predicados
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}