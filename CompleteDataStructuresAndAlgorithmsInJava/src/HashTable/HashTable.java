package HashTable;

public class HashTable {
	
	private HashItem[] hashTable;
	private int size;
	
	public HashTable(int size) {
		this.hashTable = new HashItem[size];
		this.size = size;
	}
	
	public void put(int key, int value) {
		int hashArrayIndex = hash(key);
		
		if (this.hashTable[hashArrayIndex] == null) {
			System.out.println("No collision -- inserting item (" + key + ", " + value + ") at index: " + hashArrayIndex);
			this.hashTable[hashArrayIndex] = new HashItem(key, value);
		} else {
			System.out.println("Collision! Append item to linked list");
			HashItem hashItem = this.hashTable[hashArrayIndex];
			
			while (hashItem.getNextHashItem() != null) {
				hashItem = hashItem.getNextHashItem();
				System.out.println("Next item key in linked list = " + hashItem.getKey());
			}
			System.out.println("Inserting item (" + key + ", " + value + ") at end of linked list");
			hashItem.setNextHashItem(new HashItem(key, value));
		}
	}
	
	public int get(int key) {
		int generatedArrayIndex = hash(key);
		
		if (this.hashTable[generatedArrayIndex] == null) {
			return -1;
		} else {
			HashItem hashItem = hashTable[generatedArrayIndex];
			
			while (hashItem != null && hashItem.getKey() != key) {
				hashItem = hashItem.getNextHashItem();
			}
			
			if (hashItem == null) {
				return -1;
			} else {
				return hashItem.getValue();
			}
		}
	}
	
	private int hash(int key) {
		return key % this.size;
	}
}
