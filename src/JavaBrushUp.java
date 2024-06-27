
public class JavaBrushUp {

	public static void main(String[] args) {
		
		// string -- string is a object in java which contains group of chars
		// this is a literal
//		String s = "Bhargav Sreenivas Nayaka";
		String s1 = "Bhargav Sreenivas Nayaka";
		
		
		//if we create string with new keyword it will create new object
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Bhargav Sreenivas Nayaka";
		String[] splitedString = s.split("Sreenivas");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		System.out.println();
		System.out.println(splitedString[1].trim());
		System.out.println();
		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
		}
		// print in reverse order:
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
	}


