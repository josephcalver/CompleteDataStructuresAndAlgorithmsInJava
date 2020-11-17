package Stack;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> top;
	private int size = 0;
	
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			this.top = newNode;
		} else {
			newNode.setNextNode(this.top);
			this.top = newNode;
		}
		this.size++;
	}
	
	public Node<T> pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		
		Node<T> node = top;
		if (this.size == 1) {
			this.top = null;
		} else {
			this.top = this.top.getNextNode();
		}
		this.size--;
		return node;
	}
	
	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} 
		return this.top.getData();
	}
	
	private Boolean isEmpty() {
		return this.size == 0;
	}

}
