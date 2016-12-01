public class Driver{
    public static void main(String[] args) {
	Book tester = new Book();
	tester.setAuthor("Jeffrey");
	tester.setTitle("Diary");
	tester.setISBN("00000");
	Book sec = new Book ("Jeff", "Journal", "0001");
	System.out.println(tester);
	System.out.println(sec);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	ReferenceBook ref = new ReferenceBook("Mr. K", "How2CS", "0001", "51", "Stuy");
	System.out.println(ref);
	System.out.println(ref.getCollection());
        ref.checkout("Jrm", "100");
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();

	CirculatingBook circ = new CirculatingBook ("Mr. K", "How2CS", "0001", "51");
	System.out.println(circ);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
        circ.checkout("Jrm", "100");
	System.out.println(circ);
	
	
    }
}
