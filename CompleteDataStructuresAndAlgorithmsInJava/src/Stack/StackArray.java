package Stack;

public class StackArray<T> {

	private T[] stack;
	private int numItems;
	
	public StackArray(){
		this.stack = ( T[] ) new Object[1];
	}

	public void push(T item){
		
		if ( numItems == this.stack.length ){
			resize(2*this.stack.length);
		}
		
		this.stack[numItems++] = item;
	}
	
	public T pop(){
		T itemToPop = this.stack[--numItems];
		
		if ( numItems > 0 && numItems == this.stack.length/4 ){
			resize(this.stack.length/2);
		}
		
		return itemToPop;
	}
	
	public boolean isEmpty(){
		return this.numItems == 0;
	}
	
	public int size(){
		return this.numItems;
	}

	private void resize(int capacity) {
		
		T[] stackCopy = ( T[] ) new Object[capacity];
		
		for (int i = 0; i < numItems; i++){
			stackCopy[i]=this.stack[i];
		}
		
		this.stack = stackCopy;
	}
	
}
