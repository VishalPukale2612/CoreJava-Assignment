package Ques1;
import java.util.*;
public class SortBookPrice implements Comparator<Bookkss> {

	@Override
	public int compare(Bookkss e11, Bookkss e22) {
		int diff= -Double.compare(e11.getPrice(), e22.getPrice());
		return diff;
	}

}
