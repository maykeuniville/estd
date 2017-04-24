package q4;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {
	
	@Test
	public <T> void geralTest(){
		
		SLinkedList<String> linkedListA = new SLinkedList<>();
		SLinkedList<String> linkedListB = new SLinkedList<>();
		SLinkedList<String> linkedListC = new SLinkedList<>();

		Object teste = new Object();
		
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		Node<String> nodeD = new Node<>("D");
		Node<String> nodeE = new Node<>("E");
		Node<String> nodeF = new Node<>("F");

		linkedListA.add(nodeA);
		linkedListA.add(nodeB);
		linkedListA.add(nodeC);
		linkedListA.add(nodeD);
		linkedListA.add(nodeE);
		linkedListA.add(nodeF);
		
		linkedListB.add(nodeA);
		linkedListB.add(nodeB);
		linkedListB.add(nodeC);
		linkedListB.add(nodeD);
		linkedListB.add(nodeE);
		linkedListB.add(nodeF);
		
		linkedListC.add(nodeA);
		linkedListC.add(nodeB);
		linkedListC.add(nodeC);
		linkedListC.add(nodeD);
		linkedListC.add(nodeE);
		
		boolean result = linkedListA.equals(linkedListB);
		Assert.assertTrue(result);
		
		boolean result2 = linkedListA.equals(linkedListC);
		Assert.assertFalse(result2);
		
		boolean result4 = linkedListA.equals(teste);
		Assert.assertFalse(result4);
	}
	
}
