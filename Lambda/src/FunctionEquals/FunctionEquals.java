package FunctionEquals;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionEquals extends Object{

	
	
	public static void main(String[] args) {
		Supplier<Object> objectCreator = Object::new;
        // same as new Object()
        Object objectInstance = objectCreator.get();
        System.out.println(objectInstance);

        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        // same as objectInstace.equals(new Object())
        System.out.println(equalsMethodOnClass.test(objectInstance, new Object()));

        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        // same as objectInstace.equals(new Object())
        System.out.println(equalsMethodOnObject.test(new Object()));
	}
}
