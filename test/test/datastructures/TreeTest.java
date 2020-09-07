package test.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import datastructures.BinarySearchTree;

public class TreeTest {

	private BinarySearchTree bst;

	@Before
	public void setUp() {
		bst = new BinarySearchTree();
	}

	@Test
	public void insert() {
		bst.insert(5, "e");
		bst.insert(3, "c");
		bst.insert(2, "b");
		bst.insert(4, "d");
		bst.insert(7, "g");
		bst.insert(6, "f");
		bst.insert(8, "h");
		
		Assert.assertEquals("e", bst.find(5));
		Assert.assertEquals("b", bst.find(2));
		Assert.assertEquals("g", bst.find(7));
		Assert.assertEquals(null, bst.find(99));
	}
}
