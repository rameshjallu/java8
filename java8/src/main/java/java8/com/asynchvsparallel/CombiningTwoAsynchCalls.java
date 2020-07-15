package java8.com.asynchvsparallel;

import java.util.ArrayList;
import java.util.List;

public class CombiningTwoAsynchCalls {

	public static void main(String[] args) {
		
		List<Item> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {

			list.add(new Item("item"+i,i,"type"+i%3));
		}
	
		System.out.println(list);
	}
	
	public static List<Item> getTypeItemsIncrements(List<Item> list ){
		
		
		
		
		return list;
	}
}
