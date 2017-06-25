package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {
	
	@Test
	public void Q1Test(){
		
		Q1 test = new Q1();
		ArrayQueue<Character> aq = new ArrayQueue(10);
		ArrayQueue<Character> aqVogals = new ArrayQueue(3);
		Character result;
		
		aq.enqueue('a');
		aq.enqueue('b');
		aq.enqueue('c');
		aq.enqueue('d');
		aq.enqueue('e');
		aq.enqueue('f');
		aq.enqueue('g');
		aq.enqueue('h');
		aq.enqueue('i');
		
		aqVogals = test.retVogals(aq);
		
		result = aqVogals.front();
		aqVogals.dequeue();
		Assert.assertTrue(result.equals('a'));
		
		result = aqVogals.front();
		aqVogals.dequeue();
		Assert.assertTrue(result.equals('e'));
		
		result = aqVogals.front();
		aqVogals.dequeue();
		Assert.assertTrue(result.equals('i'));
	};
}
