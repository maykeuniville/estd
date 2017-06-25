package queue;

public class Q1 {
	
	public ArrayQueue retVogals( ArrayQueue que ){
		ArrayQueue<Character> myQue = new ArrayQueue<Character>();
		int queLength = que.getSize();
		String allow = "aeiou";
		Character front;
		
		for(int i = 0; i < queLength; i++){
			
			front = (Character) que.front();
			
			if( allow.indexOf(front) != -1 ){
				
				myQue.enqueue( front );
				System.out.println(front);
			}
			que.dequeue();
		};
		
		return myQue;
		
	}
}
