package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {
	
	@Test
	public void Q2Test(){
		
		Q2 test = new Q2();
		Double[] a = {4.0,3.0,2.0};
		Double[] b = {2.0,3.0,4.0};
		Double check;
		
		ArrayQueue<Double> result = new ArrayQueue(6);
		
		result = test.retCube(a, b);
		
		check = result.front();
		result.dequeue();
		Assert.assertTrue(check == 64);
		
		check = result.front();
		result.dequeue();
		Assert.assertTrue(check == 27);

		check = result.front();
		result.dequeue();
		Assert.assertTrue(check == 8);
		
		check = result.front();
		result.dequeue();
		Assert.assertTrue(check == 8);
		
		check = result.front();
		result.dequeue();
		Assert.assertTrue(check == 27);
		
		check = result.front();
		result.dequeue();
		Assert.assertTrue(check == 64);
	};
}
