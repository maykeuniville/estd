package q5;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {
	
	@Test
	public void geralTest(){
		
		SLinkedList<String> linkedList = new SLinkedList<>();
		
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		Node<String> nodeD = new Node<>("D");
		Node<String> nodeE = new Node<>("E");
		Node<String> nodeF = new Node<>("F");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		linkedList.add(nodeD);
		linkedList.add(nodeE);
		linkedList.add(nodeF);
		
		int result = linkedList.nodeDepth("B");
		Assert.assertTrue(result == 1);

		int result2 = linkedList.nodeDepth("G");
		Assert.assertTrue(result2 == -1);
		
		int result3 = linkedList.nodeDepth("F");
		Assert.assertTrue(result3 == 5);
		
		int result4 = linkedList.nodeDepth("A");
		Assert.assertTrue(result4 == 0);
		
		

	}
	
}
