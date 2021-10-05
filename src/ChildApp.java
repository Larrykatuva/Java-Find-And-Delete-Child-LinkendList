
public class ChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildLinkedList cll = new ChildLinkedList();
		
		cll.insertFirst("Ian", "Mumo", 3);
		cll.insertFirst("Beti", "Mutinda", 8);
		cll.insertFirst("Sheillah", "Ndanu", 5);
		cll.insertFirst("Grace", "Ndanu", 7);
		
		cll.displayChildren();
		
		System.out.println("\nDeleting");
		Child deleted = cll.deleteByAge(8);
		System.out.println("Full name: "+deleted.getFullName()+" Age: "+deleted.getAge()+"\n");
		
		cll.displayChildren();
		
		System.out.println("\nFinding");
		Child found = cll.findByAge(5);
		System.out.println("Full name: "+found.getFullName()+" Age: "+found.getAge()+"\n");
		

	}

}
