public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
    private String barcoded;
    // private String[] coded = new String[] {":::||", "::|:|" , "::||:",  ":|::|"," :|:|:", ":||::"," |:::|","|::|:", "|:|::", "||:::"};
    // private int[] reference  = new int[] {1,2,3,4,5,6,7,8,9,0};
    
    
   
   
    


// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (!(zip.length() == 5)){//addcheck
	  throw new IllegalArgumentException();
      }
      _zip = zip;
      for (char c : _zip.toCharArray()){
	  //barcoded += coded[reference.indexOf(c - '0')];
	  switch (c) {
	  case '1' : barcoded += ":::||";
	      break;
	  case '2': barcoded +=  "::|:|";
	      break;
	  case '3' : barcoded += "::||:";
	      break;
	  case '4' : barcoded += ":|::|";
	      break;
	  case '5' : barcoded += ":|:|:";
	      break;
	  case '6' : barcoded += ":||::";
	      break;
	  case '7' : barcoded += "|:::|";
	      break;
	  case '8' : barcoded += "|::|:";
	      break;
	  case '9' : barcoded += "|:|::";
	      break;
	  case '0' : barcoded += "||:::";
	      break;
	  default: throw new IllegalArgumentException();
	  }
      }
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode copy = new Barcode(_zip);
      return copy;
}


    public String getWhole() {
      _checkDigit = checkSum() % 10;
      return _zip + Integer.toString(_checkDigit);
    }
      

// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int s = 0;
      for (char c : _zip.toCharArray()){
	  s += c - '0';}
      return s;
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      return _zip + " " + Integer.toString(checkSum() % 10) + " " + barcoded;
  }


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      _checkDigit = checkSum() % 10;
      String sum = getWhole();
      String  othersum = other
  }
    
}

