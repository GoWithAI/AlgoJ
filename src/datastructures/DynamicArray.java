package datastructures;

public class DynamicArray<String> {

	private Object[] data;
	private int size;
	private int initialCapacity;

	public DynamicArray(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		data = new Object[initialCapacity];
	}
	//O(1)
	public String get(int i) {
		return (String) data[i];
	}
	//O(1)
	public void set(int index, String value) {
		data[index] = value;
	}
	//O(n)
	public void insert(int index, String value) {

		// check size
		if (size == initialCapacity)
			resize();

		// Shift element
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}

		// Insert element on Index
		data[index] = value;
		size++;
	}
	//O(n)
	public void delete(int index) {

		for (int i = index; i < size; i++)
			data[i] = data[i + 1];
		
		data[size--] = null;
		
	}

	private void resize() {

		// Create double size array
		Object[] newData = new Object[initialCapacity * 2];

		// Copy element of Arrays
		for (int i = 0; i < size; i++) {
			newData[i] = data[i];
		}

		data = newData;
		initialCapacity = initialCapacity * 2;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean contains(String value) {

		for (int i = 0; i < size; i++)
			if (data[i].equals(value))
				return true;

		return false;
	}

	public int size() {
		return size;
	}

	public void print() {
		for (int i = 0; i < size; i++)
			System.out.println(data[i]);
	}

	public void add(String value) {

		if (size == initialCapacity) {
			resize();
		}

		data[size] = value;
		size++;
	}
}
