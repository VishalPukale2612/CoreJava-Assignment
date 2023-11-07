import java.util.Comparator;
public class SortEmployeeByid implements Comparator<Employee> {
	
		@Override
		public int compare(Employee e1, Employee e2) {
			int diff= e1.getId()-e2.getId();
			return diff;
		

	}
}
