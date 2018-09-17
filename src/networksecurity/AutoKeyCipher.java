package networksecurity;

/**
 * @author aftab
 */
public class AutoKeyCipher {

    public static String enCipher(String planeText, String key) {
        int size = planeText.length();

        key = key.toUpperCase();
        int k;
        char enCipheredText[] = new char[planeText.length()];

        for (int i = 0, v = 0; i < size; i++) {
            if (!(planeText.charAt(i) >= 'A' && planeText.charAt(i) <= 'Z') && !(planeText.charAt(i) >= 'a' && planeText.charAt(i) <= 'z') && !(planeText.charAt(i) >= '0' && planeText.charAt(i) <= '9')) {
                enCipheredText[i] = planeText.charAt(i);
            } else {
                if (i < key.length()) {
                    k = key.charAt(i) - 64;
                } else {
                    while (planeText.charAt(v) == ' ') {
                        v++;
                    }
                    k = planeText.toUpperCase().charAt(v);
                    if (k >= 'A' && k <= 'Z') {
                        k = k - 64;
                    } else if (k >= '0' && k <= '9') {
                        k = k - 48;
                    }
                    v++;
                }
                int p = 0, x = 0;

                if (planeText.charAt(i) >= 'A' && planeText.charAt(i) <= 'Z') {
                    p = planeText.charAt(i) - 64;
                    x = (p + k) % 26 + 64;
                } else if (planeText.charAt(i) >= 'a' && planeText.charAt(i) <= 'z') {
                    p = planeText.charAt(i) - 97;
                    x = (p + k) % 26 + 97;
                } else if (planeText.charAt(i) >= '0' && planeText.charAt(i) <= '9') {
                    p = planeText.charAt(i) - 48;
                    x = (p + k) % 9 + 48;
                }
                enCipheredText[i] = (char) x;
            }
        }
        return String.valueOf(enCipheredText);
    }

    public static String deCipher(String planeText, String key) {
        int size = planeText.length();

        key = key.toUpperCase();
        int k;
        char enCipheredText[] = new char[planeText.length()];

        for (int i = 0, v = 0; i < size; i++) {
            if (!(planeText.charAt(i) >= 'A' && planeText.charAt(i) <= 'Z') && !(planeText.charAt(i) >= 'a' && planeText.charAt(i) <= 'z') && !(planeText.charAt(i) >= '0' && planeText.charAt(i) <= '9')) {
                enCipheredText[i] = planeText.charAt(i);
            } else {
                if (i < key.length()) {
                    k = key.charAt(i) - 64;
                } else {
                    while (planeText.charAt(v) == ' ') {
                        v++;
                    }
                    k = String.valueOf(enCipheredText[v]).toUpperCase().charAt(0);
                    if (k >= 'A' && k <= 'Z') {
                        k = k - 64;
                    } else if (k >= '0' && k <= '9') {
                        k = k - 48;
                    }
                    v++;

                }
                int p, x = 0;
                if (planeText.charAt(i) >= 'A' && planeText.charAt(i) <= 'Z') {

                    p = planeText.charAt(i) - 64;
                    x = (p - k) % 26;
                    if (x < 0) {
                        x += 26;
                    }
                    x += 64;
                } else if (planeText.charAt(i) >= 'a' && planeText.charAt(i) <= 'z') {
                    p = planeText.charAt(i) - 97;
                    x = (p - k) % 26;
                    if (x < 0) {
                        x += 26;
                    }
                    x += +97;
                } else if (planeText.charAt(i) >= '0' && planeText.charAt(i) <= '9') {
                    p = planeText.charAt(i) - 48;
                    x = (p - k) % 9;
                    if (x < 0) {
                        x += 9;
                    }
                    x += 48;
                }
                enCipheredText[i] = (char) x;
            }
        }
        return String.valueOf(enCipheredText);
    }
}
