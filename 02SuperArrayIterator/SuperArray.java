import java.util.Iterator;

public class SuperArray implements Iterable<String>{
  private String[] data;
  private int size;
  

  //0

    public SuperArray() {
	data = new String[10];
	size = 0;
    }
    public SuperArray(int initialCapacity) {
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException();
	}
	data = new String[initialCapacity];
	size = 0;
    }
    public SuperArray(String[] ary) {
	size = ary.length;
	data = new String[size * 2 + 1];
	for (int i = 0; i < ary.length; i++) {
	    add(ary[i]);
	}
    }

    public Iterator<String> iterator() {
	return new SuperArrayIterator(this);
	}

  public int size(){
    return size;
  }


  //1

/**add the value n to the next available slot in the superArray.

 *this will change the size. This function should always work

 *And will resize the SuperArray if needed.*/

  public boolean add(String n){
      if (size == data.length) {
	  grow();
      }
      data[size] = n;
      size += 1;
      return true;
  }


  //2

/**Resize the data, by making a new array, then copying over elements, use this as your data.

*/


  private void grow(){
      String[] temp = new String[data.length * 2];
      for (int i = 0; i < data.length; i++) {
	  temp [i] = data[i];
  }
      data = temp;
  }

  //3

   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/

  public String toString(){
      String output = "[ ";
      for (int i = 0; i < size; i++) {
	  output = output.concat(String.valueOf(data[i]) + ", ");
      }
      return output + "]";			 
  }

  //4

        /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
    *(capacity is 10, but only 6 are used)
    *commas between... square bracket start/end and no comma at end.
    *unused slots should be printed as _ (underscores) */

  public String toStringDebug(){
      String output = "[ ";
      for (int i = 0; i < data.length; i++) {
	  if (i <= size) {
	  output = output.concat(String.valueOf(data[i]) + ", ");
	  }
	  else {
	      output = output.concat("_, ");
	  }
      }
      return output + "]";			 
  }

    void clear() {
	size = 0;
    }
    boolean isEmpty() {
	if (size == 0) {
	    return true;
	}
	return false;
    }


    String get(int index) {
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    String set(int index, String element) {
	String old = data[index];
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	if (index < size) {
	    data[index] = element;
	}
	return old;
    }
    void add(int index, String element) {
	if (index < 0 || index > size) {
	    throw new IndexOutOfBoundsException();
	}
	if (size >= data.length-1) {
	  grow();
	}
	System.out.println(size);
	if (size == 1 && index == 0) {
	    grow();
	}
	for (int i = size; i > index; i --) {
	    data[i] = data[i-1];
	    //System.out.println("shifted right");
		}
	data[index] = element;
	size += 1;
	
    }
    String remove(int index) {
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	String removed = data[index];
	for (int i = index; i <= size-1; i++) {
	    data[i] = data[i + 1];
	}
	size -=1;
	return removed;
    }

    String[] toArray() {
	String [] ary = new String[size];
	for (int i = 0; i < size; i ++) {
	    ary[i] = data[i];
	}
	return ary;
    }

    int indexOf(String i) {
	for (int j = 0; j < size; j ++) {
	    if (data[j] == i) {
		return j;
	    }
	}
	return -1;
    }

    int lastIndexOf(String i) {
	for (int j = size; j >= 0; j --) {
	    if (data[j] == i) {
		return j;
	    }
	}
	return -1;
    }


}
