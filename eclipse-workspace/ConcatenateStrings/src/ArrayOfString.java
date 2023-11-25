import java.util.*;
public class ArrayOfString {
	private ArrayList<String> arrayOfString;
	
	ArrayOfString(){
		arrayOfString = new ArrayList<String>();
	}
	public void addString(String string) {
		this.arrayOfString.add(string);
		System.out.println(string + " added to the list");
	}
	public String concatenatedString() {
		String result = "";
		for(int i = 0; i < arrayOfString.size(); i++) {
			result = result.concat(arrayOfString.get(i));
		}
		return result;
	}
}
