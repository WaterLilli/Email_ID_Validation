import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValid {

	public static void main(String[] args) {
		System.out.println("Enter your Email ID");
		
		Scanner sca = new Scanner(System.in);
		String mail = sca.next();
		
		ArrayList<String> id = new ArrayList<>();
		id.add(mail);
		for (String i : id) {
			if(isValid(i)) {
				System.out.println("email: " + i + "is found in the List");
				System.out.println("");
			}
			else {
				System.out.println("Not found");
				}
				
			
		}
		System.out.println("Email Database");
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Raquel.tech@hotmail.com");
		aList.add("Susanna.tech@hotmail.com");
		aList.add("Bernd.tech@gmail.com");
		aList.add("Johann.tech@gmail.com");
		System.out.println(aList); }

		

		public static boolean isValid(String mail)
		{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
		"[a-zA-Z0-9_+&*-]+)*" +
		"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
		"A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (mail == null)
		return false;
		return pat.matcher(mail).matches();
		}




		}

