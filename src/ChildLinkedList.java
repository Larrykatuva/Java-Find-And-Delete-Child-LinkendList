
public class ChildLinkedList {
	private Child first;
	
	
	/**
	 * Class constructor
	 */
	public ChildLinkedList() {
		this.first = null;
	}
	
	
	/**
	 * Check if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Insert first child into the linked list
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void insertFirst(String firstName, String lastName, int age) {
		Child newChild = new Child(firstName, lastName, age);
		newChild.next = this.first;
		this.first = newChild;
	}
	
	
	/**
	 * Delete child by age from the linked list
	 * @param age
	 * @return Child deleted
	 */
	public Child findByAge(int age) {
		Child currentChild = this.first;
		while(currentChild.getAge() != age) {
			if(currentChild.next == null) {
				return null;
			}else {
				currentChild = currentChild.next;
			}
		}
		return currentChild;
	}
	
	
	/**
	 * Delete child by age from the linked list
	 * @param age
	 * @return Child deleted
	 */
	public Child deleteByAge(int age) {
		Child currentChild = this.first;
		Child previousChild = this.first;
		while(currentChild.getAge() != age) {
			if(currentChild.next == null) {
				return null;
			}else {
				previousChild = currentChild;
				currentChild = currentChild.next;
			}
		}
		if(currentChild == this.first) {
			this.first = this.first.next;
		}else {
			previousChild.next = currentChild.next;
		}
		return currentChild;
	}
	
	
	/**
	 * Display all the children in the linked list
	 */
	public void displayChildren() {
		Child currentChild = this.first;
		while(currentChild != null) {
			System.out.println("Full names: "+currentChild.getFullName()+" Age: "+currentChild.getAge());
			currentChild = currentChild.next;
		}
	}
}
