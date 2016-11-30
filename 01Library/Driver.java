public class Driver{
    public static void main(String[] args) {
	Book tester = new Book();
	tester.setAuthor("Jeffrey");
	tester.setTitle("Diary");
	tester.setISBN("00000");
	Book sec = new Book ("Jeff", "Journal", "0001");
	System.out.println(tester);
	System.out.println(sec);
    }
}
