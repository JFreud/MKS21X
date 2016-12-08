public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;


// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if ((!zip.length == 5)){//addcheck
	  throw new IllegalArgumentException();
      }
      _zip = zip;
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode copy = new Barcode(_zip);
      return copy;
}



      

// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int s = 0;
      for (char c : String _zip){
	  s += c - '0';}
      return s;
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}

