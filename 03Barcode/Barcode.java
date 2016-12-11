public class Barcode implements Comparable<Barcode>{
   private String _zip;
   private int _checkDigit;
    // private String[] coded = new String[] {":::||", "::|:|" , "::||:",  ":|::|"," :|:|:", ":||::"," |:::|","|::|:", "|:|::", "||:::"};
    // private int[] reference  = new int[] {1,2,3,4,5,6,7,8,9,0};
    

  public Barcode(String zip) {
      if (!(zip.length() == 5)){//addcheck
	  throw new IllegalArgumentException();
      }
      _zip = zip;
  }


  public Barcode clone(){
      Barcode copy = new Barcode(_zip);
      return copy;
}

  public static String toCode(String zip) {
      String barcoded = "";
      for (char c : (zip + checkSum(zip) % 10).toCharArray()){
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
       return "|" + barcoded + "|";
  }

    public static String toZip(String barcode) {
	String zip = "";
	for (int i = 1; i < barcode.length() - 6; i+=5) {
	    switch (barcode.substring(i, i + 5)) {
	    case ":::||" : zip += '1';
		break;
	    case "::|:|" : zip += '2';
		break;
	    case "::||:" : zip += '3';
		break;
	    case ":|::|" : zip += '4';
		break;
	    case ":|:|:" : zip += '5';
		break;
	    case ":||::" : zip += '6';
		break;
	    case "|:::|" : zip += '7';
		break;
	    case "|::|:" : zip += '8';
		break;
	    case "|:|::" : zip += '9';
		break;
	    case "||:::" : zip += '0';
		break;
	    default: throw new IllegalArgumentException();
	    }
	}
	return zip;
    }


    public String getWhole() {
      _checkDigit = checkSum(_zip) % 10;
      return _zip + Integer.toString(_checkDigit);
    }
      

  private static int checkSum(String zip){
      int s = 0;
      for (char c : zip.toCharArray()){
	  s += c - '0';}
      return s;
}
 
  public String toString(){
      return _zip + " " + Integer.toString(checkSum(_zip) % 10) + " " + toCode(_zip);
  }

  public int compareTo(Barcode other){
      String sum = getWhole();
      String  othersum = other.getWhole();
      return sum.compareTo(othersum);
  }
    
}

