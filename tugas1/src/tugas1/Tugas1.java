package tugas1;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {
	public static void treeMap() {
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		
		tree_map.put(1, "Satu");
        tree_map.put(2, "Dua");
        tree_map.put(3, "Tiga");
        tree_map.put(4, "Empat");
        tree_map.put(5, "Lima");
        
        System.out.println("TreeMap: " + tree_map);
	}
	
	public static void treeSet() {
		Set<String> tree_set = new TreeSet<>();
		
		tree_set.add("I");
		tree_set.add("K");
		tree_set.add("E");
		
		System.out.println("TreeSet : " + tree_set);
	}
	
	public static void main(String[] args) {
		 treeMap();
		 treeSet();
	}
}
