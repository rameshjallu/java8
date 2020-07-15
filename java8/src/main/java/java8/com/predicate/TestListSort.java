package java8.com.predicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Comparator;

public class TestListSort {

	public static void main(String[] args) {
		
		List<Item> list=new ArrayList<Item>();
		
		list.add(new Item("red", 121));
		list.add(new Item("red", 122));
		list.add(new Item("blue", 123));
		list.add(new Item("blue", 129));
		list.add(new Item("gre", 124));
		
		
		list.sort((a,b)->a.price-b.price);
		
		//list.sort(comparing(Item::getPrice));
		
		System.out.println(list);
		
		
	}
}
