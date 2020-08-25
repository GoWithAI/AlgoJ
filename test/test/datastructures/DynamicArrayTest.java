package test.datastructures;

import org.junit.Assert;
import org.junit.Before;

import datastructures.DynamicArray;


public class DynamicArrayTest {

	private DynamicArray array;

    @Before
    public void SetUp() {
        array = new DynamicArray<String>(2);
    }
    
    public void GETAndSet() {
    	array.set(0, "a");
    	Assert.assertArrayEquals(0, "a");
    }
	
}
