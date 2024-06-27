import java.util.ArrayList;

public class DemoClass {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Bhargav");
		a.add("Sreenivas");
		a.add("Nayaka");
		for (int i=0;i<a.size();i++) {
			System.out.println(a.get(i)+" **** ");
		}
		System.out.println("---------------------------");
		for(String val :a) {
			System.out.println(val);
		}
		System.out.println("-------------------");
		System.out.println(a.contains("Bhargav"));
	}

}
