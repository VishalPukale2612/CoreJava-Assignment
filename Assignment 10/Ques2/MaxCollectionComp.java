package Ques2;
import java.util.*;
public class MaxCollectionComp implements Comparator<String>{

	@Override
	public int compare(String e1, String e2) {
		
		   int diff=e1.length()-e2.length();
		return diff;
	}

}
