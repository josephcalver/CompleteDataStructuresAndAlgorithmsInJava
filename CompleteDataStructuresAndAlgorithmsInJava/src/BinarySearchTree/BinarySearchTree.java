package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> root;
	
	public void insert(T data) {
		if (this.root == null) {
			this.root = new Node<T>(data);
		} else {
			insert(this.root, data);
		}	
	}
	
	private void insert(Node<T> node, T data) {
		if (data.compareTo(node.getData()) == -1) {
			if (node.getLeftChild() != null) {
				insert(node.getLeftChild(), data);
			} else {
				Node<T> newNode = new Node<T>(data);
				node.setLeftChild(newNode);
			}
		} else {
			if (node.getRightChild() != null) {
				insert(node.getRightChild(), data);
			} else {
				Node<T> newNode = new Node<T>(data);
				node.setRightChild(newNode);
			}
		}
	}
	
	public void delete(T value) {
		if (this.root != null) {
			delete(this.root, value);
		}	
	}
	
	private Node<T> delete(Node<T> node, T data) {
		if (node == null) return null;
		
		if (data.compareTo(node.getData()) == -1) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		} else if (data.compareTo(node.getData()) == 1) {
			node.setRightChild(delete(node.getRightChild(), data));	
		} else {
			if (node.getLeftChild() == null && node.getRightChild() == null) {
				return null;
			} else if (node.getLeftChild() != null && node.getRightChild() == null) {
				Node<T> temp = node.getLeftChild();
				node = null;
				return temp;
			} else if (node.getLeftChild() == null && node.getRightChild() != null) {
				Node<T> temp = node.getRightChild();
				node = null;
				return temp;
			} else {
				Node<T> temp = getPredecessor(node.getLeftChild());
				node.setData(temp.getData());
				node.setLeftChild(delete(node.getLeftChild(), temp.getData()));
			}
		}
		return node;
	}
	
	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() == null) {
			return node;
		} 
		return getPredecessor(node.getRightChild());
	}
	
	public void inOrderTraversal() {
		if (this.root == null) {
			return;
		}
		inOrderTraversal(this.root);
	}
	
	private void inOrderTraversal(Node<T> node) {
		if (node.getLeftChild() != null) {
			inOrderTraversal(node.getLeftChild());
		}
		
		System.out.print(node.getData() + " --> ");
		
		if (node.getRightChild() != null) {
			inOrderTraversal(node.getRightChild());
		}
	}

}
