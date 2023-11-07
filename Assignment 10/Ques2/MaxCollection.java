package Ques2;
import java.util.*;
public class MaxCollection {

	public static void main(String[] args) {
		
    List<String> s1=new ArrayList<String>();
    Collections.addAll(s1, "omsai","sairam","jalindar","z","tausigshaikhbhaii");
    String s2=Collections.max(s1, new MaxCollectionComp());
      System.out.println(s2);
	}

}

