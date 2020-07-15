package java8.com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.math.BigDecimal;

public class StreamGroupByTest {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product("apple", 10, new BigDecimal("9.99")),
				new Product("banana", 20, new BigDecimal("19.99")), new Product("orang", 10, new BigDecimal("29.99")),
				new Product("watermelon", 10, new BigDecimal("29.99")),
				new Product("papaya", 20, new BigDecimal("9.99")), new Product("apple", 10, new BigDecimal("9.99")),
				new Product("banana", 10, new BigDecimal("19.99")), new Product("apple", 20, new BigDecimal("9.99")));

		Map<String, Long> counting = products.stream()
				.collect(Collectors.groupingBy(Product::getName, Collectors.counting()));

		System.out.println(counting);

		Map<String, Integer> sum = products.stream()
				.collect(Collectors.groupingBy(Product::getName, Collectors.summingInt(Product::getQty)));

		System.out.println(sum);
		
		List<String> list=products.stream().map(Product::getName).collect(Collectors.toList());
		
		System.out.println(list);
	}
}
