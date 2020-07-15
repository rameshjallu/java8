package java8.com.predicate;

public class BlueItemPredicateImpl implements IPredicate<Item> {

	@Override
	public boolean test(Item item) {
		
		return item.color.equals("blue");
	}

}
