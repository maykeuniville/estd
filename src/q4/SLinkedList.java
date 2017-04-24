package q4;

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
	
	public SLinkedList<T> copy(){
		
		SLinkedList<T> newList = new SLinkedList<>();
		Node<T> value = this.getFirst();
		
		
		while(value != null){
			
			Node<T> newValue = new Node<>(value.getValue());
			
			newList.add(newValue);
			
			value = value.getNext();
		};
		
		return newList;
	}
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof SLinkedList))
			return false;
		
		@SuppressWarnings("unchecked")
		SLinkedList<T> aux = (SLinkedList<T>)obj;
		
		if(this.getSize() != aux.getSize() )
			return false;
		
		Node<T> value = this.getFirst();
		Node<T> otherValue = aux.getFirst();
		
		while(value != null && otherValue != null){
			
			if(! value.getValue().equals( otherValue.getValue() ) )
				return false;
			
			value = value.getNext();

			otherValue = otherValue.getNext();
		};
		
		return true;
	}
	
	public int nodeDepth(T value){
		
		Node<T> listValue = this.getFirst();
		int count = 0;
		while(listValue != null){
			
			if(listValue.getValue().equals(value))
				return count;
			
			count++;
			
			listValue = listValue.getNext();
		};
		return -1;
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