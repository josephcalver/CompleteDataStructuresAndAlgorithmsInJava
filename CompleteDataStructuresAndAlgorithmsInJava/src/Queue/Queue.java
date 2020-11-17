package Queue;

public class Queue<T extends Comparable<T>> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	public Queue() {
		
	}
	
	public void enqueue(T data) {
		Node<T> node = new Node<>(data);
		if (isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.setNextNode(node);
			this.tail = node;
		}
		size++;
	}
	
	public Node<T> dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		Node<T> node = this.head;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.getNextNode();
		}
		this.size--;
		return node;
	}
	
	private Boolean isEmpty() {
		return this.size == 0;
	}
	
}
