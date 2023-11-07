package Ques1;
import java.util.*;
public class SortBookIsbn implements Comparator<Bookkss> {

	@Override
	public int compare(Bookkss e1, Bookkss e2) {
		int diff= e1.getISBN().compareTo(e2.getISBN());
		return diff;
	}

}
