public class Sorts{

  public static String name(){
    return "06.Freudenberg.Jerome"; 
  }


  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){  
      for (int i = 0; i < data.length; i++) {
	  int placeholder = 0;
	  for( int j = i; j < data.length; j++) {
	      if (data[j] < data[i]) {
		  placeholder = data[i];
		  data [i] = data[j];
		  data[j] = placeholder;
	      }
	  }
      }
  }

    public static void insertionSort(int[] data) {
	for (int i = 1; i < data.length; i++) {
	    int placeholder = data[i];
	    for (int j = i - 1; j >= 0; j--) {
		if (placeholder < data[j]) {
		    //System.out.println(j);
		    data[j+1] = data[j];
		    data[j] = placeholder;
		}
		/*	else {
		    data[j] = placeholder;
		    }*/
	    }
	}
    }

    public static void bubbleSort(int[] data) {
	int temp;
	int swaps;
	boolean sorted = false;
	for (int j = 0; j < data.length - 1 && sorted == false; j++) {
	    swaps = 0;
	for (int i = 0; i < data.length - 1; i++) {
	    if (data[i + 1] < data[i]) {
		temp = data[i];
		data[i] = data[i + 1];
		data[i + 1] = temp;
		swaps += 1;
	    }
	}
	if (swaps == 0) {
	    sorted = true;
	}
	}
    }	

    public static void main (String[] args) {
	int[] data = {1,63,12,5,1235,12,-7};
	bubbleSort(data);
	for(int i : data) {
	    System.out.println(i);
	}
	System.out.println();
	int[] data2 = {1};
        bubbleSort(data2);
	for(int i : data2) {
	    System.out.println(i);
	}
    }
}

