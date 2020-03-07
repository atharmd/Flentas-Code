import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String a[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfInputs = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < noOfInputs; i++) {
			String pattern = br.readLine();
			String textstring = br.readLine();
			System.out.println(checkSubstring(pattern, textstring));
		}
	}

	private static String checkSubstring(String pattern, String textstring) {
		if(textstring.contains(pattern) || textstring.contains(new StringBuilder(pattern).reverse().toString())) {
			return "YES";
		}
		return "NO";
	}
}
