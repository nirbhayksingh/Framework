package common.selenium.interviews;

public class StringContainsExample {

	public static void main(String[] args) {
		
		String haystack="Kodejava - Learn Java by Examples";
		String needle="Java";
		
		if(haystack.indexOf(needle)!=-1) {
			System.out.println("Found the word" +needle+" at index number" +haystack.indexOf(needle));
		}
		else {
			System.out.println("Cant find " +needle);
		}
		
		
		if(haystack.contains(needle)) {
			System.out.println("We have found word Java");
		}
		
		
		
	}

}
