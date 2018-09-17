package networksecurity;

/**
 * @author aftab
 */
public class RailFenceCipher {

    public static String enCipher(String planeText, int key) {
        int size = planeText.length();
        boolean decrease = false;

        char arr[][] = new char[key][size];
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = '.';
            }
        }

        for (int i = 0, j = 0; i < size; i++) {
            char a = planeText.charAt(i);
            arr[j][i] = a;

            if (j == key - 1) {
                decrease = true;
            }
            if (decrease) {
                j--;
                if (j == 0) {
                    decrease = false;
                }
            } else {
                j++;
            }
        }

        String sipheredText = "";

        for (int i = 0; i < key; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] != '.') {
                    sipheredText += arr[i][j];
                }
            }
        }
        return sipheredText;
    }

    public static String deCipher(String enCipheredText, int key) {
        int size = enCipheredText.length();
        char arr[][] = new char[key][size];

        for (int i = 0; i < key; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = '.';
            }
        }

        boolean increase = true;
        for (int i = 0, j = 0; j < size; j++) {
            arr[i][j] = '#';

            if (i == key - 1) {
                increase = false;
            }
            if (increase) {
                i++;
            } else {
                i--;
                if (i == 0) {
                    increase = true;
                }
            }
        }

        for (int i = 0, k = 0; i < key; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == '#') {
                    arr[i][j] = enCipheredText.charAt(k);
                    k++;
                }
            }
        }

        String str = "";
        increase = true;
        for (int i = 0, j = 0; j < size; j++) {
            str += arr[i][j];

            if (i == key - 1) {
                increase = false;
            }
            if (increase) {
                i++;
            } else {
                i--;
                if (i == 0) {
                    increase = true;
                }
            }
        }
        return str;
    }
}
