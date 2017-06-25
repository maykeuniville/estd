package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {
	
	@Test
	public void Q4Test(){
		
		Q4 test = new Q4();
		int a = 10;
		ArrayQueue<Integer> result = new ArrayQueue(a-1);
		
		result = test.makeQueue(a);
		
		Assert.assertTrue(result.front() == 1);
		result.dequeue();

		Assert.assertTrue(result.front() == 2);
		result.dequeue();

		Assert.assertTrue(result.front() == 3);
		result.dequeue();

		Assert.assertTrue(result.front() == 4);
		result.dequeue();

		Assert.assertTrue(result.front() == 5);
		result.dequeue();

		Assert.assertTrue(result.front() == 6);
		result.dequeue();

		Assert.assertTrue(result.front() == 7);
		result.dequeue();

		Assert.assertTrue(result.front() == 8);
		result.dequeue();

		Assert.assertTrue(result.front() == 9);
		result.dequeue();
		
		Assert.assertNull(result.front());
	};
}
