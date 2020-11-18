package BinarySearchTree;

public class App {
	
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(5);
		bst.insert(10);
		bst.insert(2);
		bst.insert(4);
		bst.insert(3);
		bst.insert(1);
		bst.inOrderTraversal();
		
		bst.delete(1);
		System.out.println();
		bst.inOrderTraversal();
		
		bst.delete(2);
		System.out.println();
		bst.inOrderTraversal();
		
		bst.delete(10);
		System.out.println();
		bst.inOrderTraversal();
	}

}
