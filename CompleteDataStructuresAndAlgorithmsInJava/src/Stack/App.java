package Stack;

public class App {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("Caolan");
		stack.push("Joseph");
		stack.push("Freya");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.peek();
		
		StackArray<String> stackArray = new StackArray<>();
		stackArray.push("Vanessa");
		stackArray.push("Betty");
		stackArray.push("Danny");
		System.out.println(stackArray.pop());
		
	}
	
}
