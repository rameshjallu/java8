package java8.com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

	// Driver code
	public static void main(String[] args) {
		// creating a Stream of strings
		Stream<String> s = Stream.of("Geeks", "for", "GeeksforGeeks", "Geeks Classes");

		// using Collectors toList() function
		List<String> myList = s.map(String::toUpperCase).collect(Collectors.toList());

		// printing the elements
		System.out.println(myList);
	}
}
