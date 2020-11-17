package Stack;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> top;
	private int size;
	
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if (this.top == null) {
			this.top = newNode;
		} else {
			newNode.setNextNode(this.top);
			this.top = newNode;
		}
		this.size++;
	}
	
	public Node<T> pop() {
		Node<T> node;
		if (this.top == null) {
			System.out.println("Stack is empty");
			return null;
		} else if (this.size == 1) {
			node = this.top;
			this.top = null;
		} else {
			node = this.top;
			this.top = this.top.getNextNode();
		}
		this.size--;
		return node;
	}
	
	public T peek() {
		if (this.size == 0) {
			System.out.println("Stack is empty");
			return null;
		} 
		return this.top.getData();
	}

}
