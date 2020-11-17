package Queue;

public class App {

	public static void main(String[] args) {
		
		Queue<String> queue = new Queue<>();
		queue.enqueue("Joseph");
		queue.enqueue("Caolan");
		queue.enqueue("Freya");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}
	
}