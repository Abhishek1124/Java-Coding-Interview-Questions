package Solutions;

public class covertToCamel {

	public static void main(String[] args) {
		String sentence = "ThiS iS an inteRVieW fOr thE rOLe of SenIoR SdET fOR QE TeAm aT BlAckLinE.wE ARe foCCused oN qE - automatIon testIng.";
		String[] words = sentence.split("[\\s,.]+");

		StringBuilder modifiedSentence = new StringBuilder();
		for (String word : words) {
			char firstLetter = Character.toUpperCase(word.charAt(0));
			String restOfWord = word.substring(1).toLowerCase();
			modifiedSentence.append(firstLetter).append(restOfWord).append(" ");
		}

		System.out.println(modifiedSentence.toString().trim());
	}

}
