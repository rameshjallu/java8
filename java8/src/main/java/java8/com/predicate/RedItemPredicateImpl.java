package java8.com.predicate;

public class RedItemPredicateImpl implements IPredicate<Item> {

	@Override
	public boolean test(Item item) {
		return item.color.equals("red");
	}

}
