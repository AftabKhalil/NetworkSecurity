package networksecurity;

/**
 * @author aftab
 */
public class VigenereCipher {

    public static String enCipher(String text, String key) {
        char textArray[] = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int keyi = key.charAt(i % key.length());

            int x = textArray[i];
            if (x >= '0' && x <= '9') {
                x = (((x - 48) + keyi) % 9) + 48;
            } else if (x >= 'A' && x <= 'Z') {
                x = (((x - 65) + keyi) % 26) + 65;
            } else if (x >= 'a' && x <= 'z') {
                x = (((x - 97) + keyi) % 26) + 97;
            }
            textArray[i] = (char) x;
        }
        return String.copyValueOf(textArray);
    }

    public static String deCipher(String text, String key) {
        char textArray[] = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int keyi = key.charAt(i % key.length());
            int x = textArray[i];
            if (x >= '0' && x <= '9') {
                x -= 48;
                x = (x - keyi) % 9;
                if (x < 0) {
                    x += 9;
                }
                x += 48;
            } else if (x >= 'A' && x <= 'Z') {
                x -= 65;
                x = (x - keyi) % 26;
                if (x < 0) {
                    x += 26;
                }
                x += 65;
            } else if (x >= 'a' && x <= 'z') {
                x -= 97;
                x = (x - keyi) % 26;
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
