import java.util.*;

public class SuperArrayIterator implements Iterator<String> {
    public int count;
    public SuperArray supahray  = new SuperArray();

    public SuperArrayIterator (SuperArray supahray) {
        this.supahray = supahray;
	count = 0;
    }

    public String next() {
	if (hasNext()) {
	    return supahray.get(count++);
	}
	else {
	    throw new NoSuchElementException();
	}
    }

    public boolean hasNext() {
	return count < supahray.size();
    }

    public void remove() {};
	
}
