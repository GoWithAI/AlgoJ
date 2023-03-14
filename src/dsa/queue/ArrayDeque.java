package dsa.queue;

//FIFO - First In First Out
public class ArrayDeque {

	// rear mean back
	private int rear = 0, front = 0, size = 0;

	private int CAPACITY = 7;

	int[] arr;

	public ArrayDeque() {
		arr = new int[CAPACITY];
	}

	// add data at front of Queue
	public void enQueue(int data) {

		if (size == CAPACITY)
			throw new IllegalStateException("Queue Overflow");

		arr[rear] = data;
		rear = (rear + 1) % CAPACITY; // so after end it will back to 0 ( Circular Queue )
		size++;
	}

	public int deQueue() {

		if (size == 0)
			throw new IllegalStateException("Queue is Empty");

		arr[front] = Integer.MIN_VALUE;
		int data = arr[front];
		front = (front + 1) % CAPACITY;
		size--;
		return data;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == CAPACITY;
	}

	public int size() {
		return size;
	}

	// Print Queue as per sequence
	public void print() {
		System.out.println();

		for (int i = 0; i < size; i++) {
			int data2 = arr[(front + i) % CAPACITY];
			System.out.print("  " + data2);
		}

	}

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();

		ad.enQueue(4);
		ad.enQueue(7);
		ad.enQueue(9);
		ad.enQueue(8);
		ad.print();
		ad.deQueue();
		ad.print();
	}
}
