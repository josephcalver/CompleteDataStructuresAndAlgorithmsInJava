package Heap;

public class App {

	public static void main(String[] args) {
		
		Heap heap = new Heap(10);
		
		heap.insert(5);
		heap.insert(10);
		heap.insert(30);
		heap.insert(50);
		heap.insert(20);
		heap.insert(100);
		
		heap.heapsort();
		
	}

}
