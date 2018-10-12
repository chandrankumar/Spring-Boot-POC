

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
			if(integer == 3) {
				//numbers.remove(integer);
				//numbers.add(6);
			}
			
		}*/
		
		Map<Integer, Integer> store = new HashMap<>();
		store.put(1, 10);
		store.put(2, 20);
		store.put(3, 30);
		store.put(4, 40);
		/*for (Integer integer : store.keySet()) {
			
			if(integer.equals(4)) {
				
				System.out.println(store.get(integer));
				store.put(integer,integer);
				
			}
			
			
		}*/
		Iterator<Integer> iterate = store.keySet().iterator();
		while(iterate.hasNext()) {
			
			if(iterate.next().equals(4)) {
				store.put(5,50);
				//System.out.println(store);
			}
		}
		
		store.keySet().stream().filter(predicate ->	!predicate.equals(2)).forEach(values -> {
			System.out.println(values);
		});
		
		Integer reduce = store.keySet().stream().reduce(0, (a,b) -> a+b);
		System.out.println(reduce);
		
		Stream<Integer> sorted = store.values().stream().sorted();
		System.out.println(sorted.collect(Collectors.toList()));
	}

	
	
	
}
