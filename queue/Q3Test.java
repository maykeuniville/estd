package queue;

import org.junit.Assert;
import org.junit.Test;

//Dada uma fila de números inteiros, retorne a soma de todos eles.

public class Q3Test {

	@Test
	public void Q3Test(){
		
		Q3 test = new Q3();
		ArrayQueue<Integer> aq = new ArrayQueue(10);
		Integer result;
		
		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		
		result = test.retSum(aq);

		Assert.assertTrue(result == 10);
	}
}
