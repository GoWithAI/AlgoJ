package test.datastructures;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import datastructures.HashTable;

public class HashTableTest {

	private HashTable hashTable;

	@Before
	public void setUpBeforeClass() throws Exception {
		hashTable = new HashTable();
	}

	@Test
	public void PutAndGet() {
		hashTable.put("Deepak", "123");
		hashTable.put("Preeti", "456");
		hashTable.put("Deep", "12");
		hashTable.put("Pree", "34");
		hashTable.put("D", "1");
		
		Assert.assertEquals("123", hashTable.get("Deepak"));
		Assert.assertEquals("456", hashTable.get("Preeti"));
		Assert.assertEquals("12", hashTable.get("Deep"));
		Assert.assertEquals("34", hashTable.get("Pree"));
		Assert.assertEquals("1", hashTable.get("D"));
	}
	
	@Test
	public void collision() {
		hashTable.put("Deepak", "123");
		hashTable.put("Preeti", "456");
		
		Assert.assertEquals("123", hashTable.get("Deepak"));
		Assert.assertEquals("456", hashTable.get("Preeti"));
	}

}
