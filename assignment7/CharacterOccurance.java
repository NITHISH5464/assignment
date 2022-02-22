package assignment7;

public class CharacterOccurance {
	public static void main(String[] args) {
		String input="wlecome to great   aakirikalan show ";
		int count=0;
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)=='a'){
				count++;
			}
		}System.out.println(count);
	}

}
