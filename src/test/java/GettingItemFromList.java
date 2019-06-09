import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.TestObject;
import org.junit.Test;

public class GettingItemFromList extends AbstractData {

	@Test
	public void getItemArrayList() {
		List<TestObject> list = new ArrayList<>(100_000_000);
		fillListWith_100_000_000_Items(testObject, list);

		var start = System.nanoTime();
		list.get(50_000_000);
		var end = System.nanoTime();

		System.err.println(String.format("Millis to get an item from array list: %s", toMillis(start, end)));
		// Execution time: 0.009 millis (average)
	}

	@Test
	public void getItemLinkedList() {
		List<TestObject> list = new LinkedList<>();
		fillListWith_100_000_000_Items(testObject, list);

		var start = System.nanoTime();
		list.get(50_000_000);
		var end = System.nanoTime();

		System.err.println(String.format("Millis to get an item from linked list: %s", toMillis(start, end)));
		// Execution time: 197.437 millis (average)
	}

}
