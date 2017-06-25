package queue;

public class Q3 {
	
	public Integer retSum(ArrayQueue<Integer> a){
		
		Integer sum = 0;
		int length = a.getSize();
		
		for(int i = 0; i< length; i++){
			
			sum += a.front();
			
			a.dequeue();
		}

		return sum;
	}
}
