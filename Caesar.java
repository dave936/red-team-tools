import java.lang.*;
public class Caesar {
    public String rotate(String s, int amount) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean upperCase = false;
            //Check if uppercase.
            if (Character.isUpperCase(c)) {
                upperCase = true;
                c = Character.toLowerCase(c);
            }
            int ascii = c;
            if (ascii > 96) {
                char rotatedAscii;
                int rotatedRawVal = (ascii - 96) + amount;
                int alphabetVal = rotatedRawVal % 26;
                //ASCII Value for z = 122.
                if (alphabetVal == 0) {
                    rotatedAscii = (char) 122;
                }
                else {
                    rotatedAscii = (char) (alphabetVal + 96);
                }
                //Change back to upper-case.
                if (upperCase == true) {
                    rotatedAscii = Character.toUpperCase(rotatedAscii);
                }
                newString += rotatedAscii;
            }
        }
        return newString;
    }
}
