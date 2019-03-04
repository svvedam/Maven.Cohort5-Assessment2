package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String returnString = string1+string2;
        return returnString;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        StringBuilder sbr = new StringBuilder();
        sbr.append(string1);
        sbr.reverse();
        return sbr.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String revString1 = reverse(string1);
        String revString2 = reverse(string2);
        String concatString = revString1+ revString2;
        return concatString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char[] charArray = charactersToRemove.toCharArray();
        for(int i =0; i<charArray.length;i++){
            String temp = Character.toString(charArray[i]);
            string= string.replace(temp,"");
        }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newString = removeCharacters(string,charactersToRemove);
        String reverseString = reverse(newString);

        return reverseString;
    }
}
