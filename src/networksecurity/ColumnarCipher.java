package networksecurity;

/**
 * @author aftab
 */
public class ColumnarCipher {

    public static String enCipher(String planeText, String key) {
        int CN[] = new int[key.length()];
        int c = 0;
        for (int i = 0; i < 26; i++) {
            for (int index = 0; index < key.length(); index++) {
                if (key.charAt(index) == ('A' + i)) {
                    CN[c] = index;
                    c++;
                }
            }
        }

        String str = "";
        int cols = key.length();
        int rows = (planeText.length() / key.length()) + 1;
        char pt[][] = new char[rows][cols];
        int size = planeText.length();

        for (int x = 0, i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (x < size) {
                    pt[i][j] = planeText.charAt(x);
                    x++;
                } else {
                    pt[i][j] = 'X';
                }
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                str += pt[j][CN[i]];
            }
        }
        return str;
    }

    public static String deCipher(String enCipheredText, String key) {
        int CN[] = new int[key.length()];
        int c = 0;
        for (int i = 0; i < 26; i++) {
            for (int index = 0; index < key.length(); index++) {
                if (key.charAt(index) == ('A' + i)) {
                    CN[c] = index;
                    c++;
                }
            }
        }

        String str = "";
        int cols = key.length();
        int rows = (enCipheredText.length() / key.length());
        char pt[][] = new char[rows][cols];

        int size = enCipheredText.length();
        c = 0;

        for (int x = 0, j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                pt[i][CN[c]] = enCipheredText.charAt(x);
                x++;
            }
            c++;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                str += pt[i][j];
            }
        }
        return str;
    }
}
