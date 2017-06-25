package queue;

public class Q2 {
	
	public ArrayQueue retCube(Double[] a, Double[] b){
		
		ArrayQueue<Double> aq = new ArrayQueue<Double>();
		
		for (Double c : a)
			aq.enqueue(Math.pow(c, 3));
		
		for (Double c : b)
			aq.enqueue(Math.pow(c, 3));		
		
		return aq;
	}
}
