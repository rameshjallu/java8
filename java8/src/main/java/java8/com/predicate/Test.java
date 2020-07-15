package java8.com.predicate;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Item> list=new ArrayList<Item>();
		
		list.add(new Item("red", 121));
		list.add(new Item("red", 122));
		list.add(new Item("blue", 123));
		list.add(new Item("blue", 124));
		list.add(new Item("gre", 124));
		
		ItemFilter filter=new ItemFilter();
		
		System.out.println(filter.filter(list, i ->"grey".equals(i.color)));
		
	}
}
