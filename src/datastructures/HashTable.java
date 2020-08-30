package datastructures;

// Instead of Linked List we can try to use Tree in Future
public class HashTable {

	// Hashtable ht = new Hashtable();

	private int INITAL_SIZE = 16;
	private HashEntry[] data; // LinkedList

	public class HashEntry {
		String key;
		String value;
		HashEntry next;

		public HashEntry(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
	}

	public HashTable() {
		data = new HashEntry[INITAL_SIZE];
	}

	public void put(String key, String value) {

		int index = getIndex(key);

		HashEntry entry = new HashEntry(key, value);

		if (data[index] == null)
			data[index] = entry;
		else {
			HashEntry hashEntry = data[index];
			// traverse linked list
			while (hashEntry.next != null)
				hashEntry = hashEntry.next;

			hashEntry.next = entry;
		}
	}

	// lookup O(1)
	public String get(String key) {

		int index = getIndex(key);

		HashEntry hashEntry = data[index];

		if (hashEntry != null) {
			while (hashEntry.next != null && !hashEntry.key.equals(key))
				hashEntry = hashEntry.next;

			return hashEntry.value;

		}
		return null;
	}

	public int getIndex(String key) {

		int hashCode = key.hashCode();
		System.out.println("hashCode :" + hashCode);
		// real time we need to use it - Betwise operation to became postive hash code
		int index = (hashCode & 0x7fffffff) % INITAL_SIZE;
		// int index = hashCode % INITAL_SIZE;
		System.out.println("index :" + index);
		// Intention Collision
		if (key.equals("Deepak") || key.equals("Preeti")) {
			return 4;
		}

		return index;
	}

}
