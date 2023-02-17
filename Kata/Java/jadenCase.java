import org.apache.commons.lang3.text.WordUtils;

public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
    String jadenCase = "";
		if(phrase == "" | phrase == null) {
      return null;
    } jadenCase = WordUtils.capitalizeFully(phrase);
    return jadenCase;
	}
}

//Easy WordUtil solution to capitalizing text. This code fully capitalizes all text in a string into
// "Jaden Smith-case" (pascal case)