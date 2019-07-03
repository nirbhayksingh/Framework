package common.selenium.interviews;

public class ExtractsWordsFromString {

	public static void main(String[] args) {

		String str="Hey this is Nirbhay Singh";
		
		String[] words=str.split(" ");
		
		for(String word: words) {
			System.out.println(word);
		}
		
		
	}

}
