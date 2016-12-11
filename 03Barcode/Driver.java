public class Driver {
    public static void main(String[] args) {
	Barcode tester = new Barcode("08451");
	System.out.println(tester);
	System.out.println(tester.toCode("08451"));
	System.out.println(tester.toZip("|||:::|::|::|::|:|:|::::|||::|:|"));
    }
}
