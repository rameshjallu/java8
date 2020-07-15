package java8.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
    	
        List<Integer> list=Arrays.asList(2,1,33,4);
        
       // list.sort(Comparator.naturalOrder());
        
        list.sort(Comparator.reverseOrder());
        
        System.out.println(list);
    }
}
