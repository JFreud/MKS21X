public class CirculatingBook extends LibraryBook {
    String currentHolder;
    String dueDate;

    public CirculatingBook(String author, String title, String ISBN, String callNumber) {
	super(author, title, ISBN, callNumber);
    }

    public String getCurrentHolder() {
	return currentHolder;
    }

    public String getDueDate() {
	return dueDate;
    }

    public void setCurrentHolder(String currentHolder) {
	this.currentHolder = currentHolder;
    }

    public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
    }

    public void checkout(String patron, String due) {
	currentHolder = patron;
	dueDate = due;
    }

    public void returned() {
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus() {
	if (currentHolder == null) {
	    return "book available on shelves";
	}
	else {
	    return " CurrentHolder: " + currentHolder + "    Due Date: " + dueDate;
	}
    }

    public String toString() {
	if (currentHolder == null) {
	    return super.toString();
	}
	else {
	    return super.toString() + "\nCurrentHolder: " + currentHolder + "\nDue Date: " + dueDate + "\n";
	}
    }



}
