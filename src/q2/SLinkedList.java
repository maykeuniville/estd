package q2;

public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;

	private long size = 0;

	public long getSize() {
		return size;
	}

	public Node<T> search(T value){
		
		Node<T> listValue = this.getFirst();
		
		while(listValue != null){
			if(listValue.getValue().equals(value)){
				return listValue;
			};
			
			listValue = listValue.getNext();
		};
		
		return null;
	}
	
	public int nodeHeight(T value){
			
		Node<T> listValue = this.getFirst();
		int height = -1;
		boolean startCount = false;
		
		while(listValue != null){
			
			if(listValue.getValue().equals(value))
				startCount = true;
			
			if(startCount)
				height++;
			
			listValue = listValue.getNext();
		};
		
		return height;
	}

	public void removeFirst() {
		if (!isEmpty()) {
			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = null;
			}
		}
	}

	public void add(Node<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

}