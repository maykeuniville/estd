package q6;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedListTest {
	
	@Test
	public void geralTest(){
		
		DLinkedList<String> linkedList = new DLinkedList<>();
		
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");
		DNode<String> nodeD = new DNode<>("D");
		DNode<String> nodeE = new DNode<>("E");
		DNode<String> nodeF = new DNode<>("F");

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
