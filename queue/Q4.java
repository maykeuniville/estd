package queue;

//Dada um n�mero inteiro n, retorne uma fila contendo todos os n�meros maiores que zero e menores que n.

public class Q4 {
	
	public ArrayQueue<Integer> makeQueue(Integer a){
		
		ArrayQueue<Integer> aq = new ArrayQueue(a-1);
		
		for(int i = 1; i<a; i++){
			
			aq.enqueue(i);
		}
		
		return aq;
	}
}
