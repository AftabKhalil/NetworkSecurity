package networksecurity;

/**
 * @author aftab
 */
public class CeasorCipher {

    public static String enCipher(String text, int key) {
        char textArray[] = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int x = textArray[i];
            if (x >= '0' && x <= '9') {
                x = (((x - 48) + key) % 9) + 48;
            } else if (x >= 'A' && x <= 'Z') {
                x = (((x - 65) + key) % 26) + 65;
            } else if (x >= 'a' && x <= 'z') {
                x = (((x - 97) + key) % 26) + 97;
            }
            textArray[i] = (char) x;
        }
        return String.copyValueOf(textArray);
    }

    public static String deCipher(String text, int key) {
        char textArray[] = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int x = textArray[i];
            if (x >= '0' && x <= '9') {
                x -= 48;
                x = (x - key) % 9;
                if (x < 0) {
                    x += 9;
                }
                x += 48;
            } else if (x >= 'A' && x <= 'Z') {
                x -= 65;
                x = (x - key) % 26;
                if (x < 0) {
                    x += 26;
                }
                x += 65;
            } else if (x >= 'a' && x <= 'z') {
                x -= 97;
                x = (x - key) % 26;
                if (x < 0) {
                    x += 26;
                }
                x += 97;
            }
            textArray[i] = (char) x;
        }
        return String.copyValueOf(textArray);
    }
}
