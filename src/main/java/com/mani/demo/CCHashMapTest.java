package com.mani.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/*public class ConcurrentModificationException
extends RuntimeException

This exception may be thrown by methods that have detected concurrent modification of an object when such modification is not permissible.
For example, it is not generally permissible for one thread to modify a Collection while another thread is iterating over it. In general, the results of the iteration are undefined under these circumstances. Some Iterator implementations (including those of all the general purpose collection implementations provided by the JRE) may choose to throw this exception if this behavior is detected. Iterators that do this are known as fail-fast iterators, as they fail quickly and cleanly, rather that risking arbitrary, non-deterministic behavior at an undetermined time in the future.

Note that this exception does not always indicate that an object has been concurrently modified by a different thread. If a single thread issues a sequence of method invocations that violates the contract of an object, the object may throw this exception. For example, if a thread modifies a collection directly while it is iterating over the collection with a fail-fast iterator, the iterator will throw this exception.

Note that fail-fast behavior cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. Fail-fast operations throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: ConcurrentModificationException should be used only to detect bugs.

Since:
1.2
See Also:
Collection, Iterator, ListIterator, Vector, LinkedList, HashSet, Hashtable, TreeMap, AbstractList, Serialized Form*/
public class CCHashMapTest {

	public static void main(String[] args) {

		Map<Integer, String> hp = new HashMap<Integer, String>();

		hp.put(null, "Manisha");
		hp.put(2, "Priyadarshi");
		hp.put(3, "Kumari");
		hp.put(3, "Niketan");
		hp.put(5, "Rahul");
		hp.put(6, "Ranjan");

		for (Entry<Integer, String> entry : hp.entrySet()) {

			System.out.println(entry.getValue());
			hp.put(9, "David"); // runs fine
			break;

		}

		
		// hp.put(7, "David"); -->Exception in thread "main"  java.util.ConcurrentModificationException

		Map<Integer, String> chp = new ConcurrentHashMap<Integer, String>(); //no null key or null value allowed

		chp.put(1, "Manisha");
		chp.put(2, "Priyadarshi");
		chp.put(3, "Kumari");
		chp.put(4, "Niketan");
		chp.put(5, "Rahul");
		chp.put(6, "Ranjan");

		for (Entry<Integer, String> entry : chp.entrySet()) {

			System.out.println(entry.getValue());
			chp.put(5, "David");
		}
 
	}

}
