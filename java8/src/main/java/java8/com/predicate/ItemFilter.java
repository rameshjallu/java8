package java8.com.predicate;

import java.util.ArrayList;
import java.util.List;

public class ItemFilter {

	public List<Item> filter(List<Item> list,IPredicate<Item> p){
		List<Item> ans=new ArrayList<Item>();
		
		for(Item i:list) {
			
			if(p.test(i)) {
				ans.add(i);
			}
		}
		return ans;
		
	}
}
