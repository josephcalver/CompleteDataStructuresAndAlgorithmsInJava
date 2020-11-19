package Heap;

public class Heap {

	private Integer[] heap;
	private int currentPosition = -1;
	
	public Heap(int size) {
		this.heap = new Integer[size];
	}
	
	public void insert(int item) {
		if (isFull()) {
			throw new RuntimeException("Heap is full...");
		}
		
		this.heap[++currentPosition] = item;
		fixUp(currentPosition);
	}
	
	private void fixUp(int index) {
		int parentIndex = (index - 1) / 2;
		
		while (parentIndex >= 0 && this.heap[parentIndex] < this.heap[index]) {
			int temp = this.heap[index];
			this.heap[index] = this.heap[parentIndex];
			this.heap[parentIndex] = temp;
			index = parentIndex;
			parentIndex = (index - 1) / 2;
		}
	}
	
	public int getMax() {
		int result = this.heap[0];
		this.heap[0] = this.heap[this.currentPosition];
		this.heap[this.currentPosition] = 0;
		this.currentPosition--;
		fixDown(0, -1);
		return result;
	}
	
	private void fixDown(int index, int end) {
		// Necessary test if heapSort() shares fixDown() method with getMax() / getMin()
		if (end < 0) end = currentPosition; 
		
		while (index <= end) {
			int leftChild = 2 * index + 1;
			int rightChild = 2 * index + 2;
			
			if (leftChild <= end) {
				int childToSwap;
				
				if (rightChild > end) {
					childToSwap = leftChild;
				} else {
					childToSwap = (this.heap[leftChild] > this.heap[rightChild]) ? leftChild : rightChild;
				}
				
				if (this.heap[index] < this.heap[childToSwap]) {
					int temp = this.heap[index];
					this.heap[index] = this.heap[childToSwap];
					this.heap[childToSwap] = temp;
				} else {
					break;
				}
				
				index = childToSwap;
			} else {
				break;
			}
		}
	}
	
	public void heapsort() {
		// Elements are printed in max to min order, but end up in min to max order in the heap itself
		for (int i = 0; i <= this.currentPosition; i++) {
			int temp = this.heap[0];
			System.out.println(temp + " --> ");
			this.heap[0] = this.heap[this.currentPosition - i];
			this.heap[this.currentPosition - i] = temp;
			fixDown(0, this.currentPosition - i - 1); // Bring next largest int to root position
		}
	}
	
	private Boolean isFull() {
		return this.currentPosition == this.heap.length;
	}
	
}
