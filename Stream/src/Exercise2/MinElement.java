package Exercise2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class MinElement {
	public static void main(String[] args) {
		minElem();
	}
	
	private static void minElem(){
		 Collection<String> names = Arrays.asList("Marcin", "Marek", "Mariusz", "Marian");
	     Optional<String> name = min(names, Comparator.comparingInt(String::length));
	     System.out.println(name.get());
	}

	public static <T> Optional<T> min(Collection<T> collection, Comparator<T> comparator){
		return collection.stream().reduce(BinaryOperator.minBy(comparator));
	}
}
