package test.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import datastructures.LinkedList;

public class LinkedListTest {

	private LinkedList linkedList;

	@Before
	public void setup() {
		linkedList = new LinkedList();
	}

	@Test
	public void addFront() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		
		Assert.assertEquals(3, linkedList.getFirst());
		Assert.assertEquals(1,linkedList.getLast());
	}

	@Test
	public void addFirst() {
		linkedList.addFront(1);
		Assert.assertEquals(1, linkedList.getFirst());
	}

	@Test
	public void addLast() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		Assert.assertEquals(1, linkedList.getLast());
	}

	@Test
	public void addBack() {
		linkedList.addBack(1);
		linkedList.addBack(2);
		linkedList.addBack(3);
		
		Assert.assertEquals(1, linkedList.getFirst());
		Assert.assertEquals(3,linkedList.getLast());
	}
	
	@Test
	public void size() {
		
		Assert.assertEquals(0, linkedList.size());
		linkedList.addBack(1);
		Assert.assertEquals(1, linkedList.size());
		linkedList.addBack(2);
		Assert.assertEquals(2, linkedList.size());

	}
	
	@Test
	public void clear() {
		linkedList.addBack(1);
		linkedList.addBack(2);
		linkedList.addBack(3);
		
		linkedList.clear();

		Assert.assertEquals(0,linkedList.size());
	}
	
	@Test
	public void delete() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		linkedList.addFront(4);
		
		linkedList.delete(3);

		Assert.assertEquals(3,linkedList.size());
		Assert.assertEquals(false,linkedList.contains(3));
	}
}
