package networksecurity;

/**
 * @author aftab
 */
public class SDES {

    public static class Encryptor {

        public static char[] key1;
        public static char[] key2;
        public static char[] enc;

        public static String encrypt(String planeText, String key) {
            char[] keyc = key.toCharArray();
            char[][] keys = keyGenerator(keyc);
            key1 = keys[0];
            key2 = keys[1];

            char[] planeText_ = planeText.toCharArray();
            char[] afterIP = IP(planeText_);

            char[] leftFour = new char[4];
            char[] rightFour = new char[4];

            leftFour[0] = afterIP[0];
            leftFour[1] = afterIP[1];
            leftFour[2] = afterIP[2];
            leftFour[3] = afterIP[3];
            rightFour[0] = afterIP[4];
            rightFour[1] = afterIP[5];
            rightFour[2] = afterIP[6];
            rightFour[3] = afterIP[7];

            char[] rightFourEP = EP(rightFour);
            char[] rightAfterXor = xor(rightFourEP, key1);

            char[] lleftFour = new char[4];
            char[] lrightFour = new char[4];

            lleftFour[0] = rightAfterXor[0];
            lleftFour[1] = rightAfterXor[1];
            lleftFour[2] = rightAfterXor[2];
            lleftFour[3] = rightAfterXor[3];
            lrightFour[0] = rightAfterXor[4];
            lrightFour[1] = rightAfterXor[5];
            lrightFour[2] = rightAfterXor[6];
            lrightFour[3] = rightAfterXor[7];

            char[] s0c = s0(lleftFour);

            char[] s1c = s1(lrightFour);

            char[] fourBit = new char[4];
            fourBit[0] = s0c[0];
            fourBit[1] = s0c[1];
            fourBit[2] = s1c[0];
            fourBit[3] = s1c[1];

            fourBit = p4(fourBit);

            fourBit = xor(leftFour, fourBit);

            char[] _rightfourEP = EP(fourBit);

            _rightfourEP = xor(_rightfourEP, key2);

            lleftFour[0] = _rightfourEP[0];
            lleftFour[1] = _rightfourEP[1];
            lleftFour[2] = _rightfourEP[2];
            lleftFour[3] = _rightfourEP[3];
            lrightFour[0] = _rightfourEP[4];
            lrightFour[1] = _rightfourEP[5];
            lrightFour[2] = _rightfourEP[6];
            lrightFour[3] = _rightfourEP[7];

            char[] _s0c = s0(lleftFour);
            char[] _s1c = s1(lrightFour);

            char[] _fourBit = new char[4];
            _fourBit[0] = _s0c[0];
            _fourBit[1] = _s0c[1];
            _fourBit[2] = _s1c[0];
            _fourBit[3] = _s1c[1];

            _fourBit = p4(_fourBit);

            char[] fourBitsAfterXor = xor(_fourBit, rightFour);

            char[] eightBits = new char[8];
            eightBits[0] = fourBitsAfterXor[0];
            eightBits[1] = fourBitsAfterXor[1];
            eightBits[2] = fourBitsAfterXor[2];
            eightBits[3] = fourBitsAfterXor[3];
            eightBits[4] = fourBit[0];
            eightBits[5] = fourBit[1];
            eightBits[6] = fourBit[2];
            eightBits[7] = fourBit[3];

            enc = IPI(eightBits);
            return String.valueOf(enc);
        }

    }

    public static class Dryptor {

        public static char[] key1;
        public static char[] key2;
        public static char[] dec;

        public static void deCrypt(String cipherText, String key) {
            char[] keyc = key.toCharArray();
            char[][] keys = keyGenerator(keyc);
            key1 = keys[0];
            key2 = keys[1];
            char cipherText_[] = cipherText.toCharArray();
            char[] afterIP = IP(cipherText_);
            //System.out.println(afterIP);

            char[] leftFour = new char[4];
            char[] rightFour = new char[4];

            leftFour[0] = afterIP[0];
            leftFour[1] = afterIP[1];
            leftFour[2] = afterIP[2];
            leftFour[3] = afterIP[3];
            rightFour[0] = afterIP[4];
            rightFour[1] = afterIP[5];
            rightFour[2] = afterIP[6];
            rightFour[3] = afterIP[7];

            char[] rightFourEP = EP(rightFour);

            //System.out.println(rightFourEP);
            char[] rightAfterXor = xor(rightFourEP, key2);

            //System.out.print(rightAfterXor);
            char[] lleftFour = new char[4];
            char[] lrightFour = new char[4];

            lleftFour[0] = rightAfterXor[0];
            lleftFour[1] = rightAfterXor[1];
            lleftFour[2] = rightAfterXor[2];
            lleftFour[3] = rightAfterXor[3];
            lrightFour[0] = rightAfterXor[4];
            lrightFour[1] = rightAfterXor[5];
            lrightFour[2] = rightAfterXor[6];
            lrightFour[3] = rightAfterXor[7];

            char[] s0c = s0(lleftFour);
            //System.out.print(s0c);

            char[] s1c = s1(lrightFour);
            //System.out.print(s1c);

            char[] fourBit = new char[4];
            fourBit[0] = s0c[0];
            fourBit[1] = s0c[1];
            fourBit[2] = s1c[0];
            fourBit[3] = s1c[1];

            fourBit = p4(fourBit);

            //System.out.print(fourBit);
            fourBit = xor(leftFour, fourBit);

            //System.out.print(fourBit);
            char[] _rightfourEP = EP(fourBit);

            //System.out.print(_rightfourEP);
            _rightfourEP = xor(_rightfourEP, key1);

            //System.out.print(_rightfourEP);
            lleftFour[0] = _rightfourEP[0];
            lleftFour[1] = _rightfourEP[1];
            lleftFour[2] = _rightfourEP[2];
            lleftFour[3] = _rightfourEP[3];
            lrightFour[0] = _rightfourEP[4];
            lrightFour[1] = _rightfourEP[5];
            lrightFour[2] = _rightfourEP[6];
            lrightFour[3] = _rightfourEP[7];

            //System.out.println(lleftFour);
            char[] _s0c = s0(lleftFour);
            //System.out.print(_s0c);

            char[] _s1c = s1(lrightFour);
            //System.out.print(_s1c);

            char[] _fourBit = new char[4];
            _fourBit[0] = _s0c[0];
            _fourBit[1] = _s0c[1];
            _fourBit[2] = _s1c[0];
            _fourBit[3] = _s1c[1];

            _fourBit = p4(_fourBit);

            //System.out.print(_fourBit);
            char[] fourBitsAfterXor = xor(_fourBit, rightFour);

            //System.out.print(fourBitsAfterXor);
            char[] eightBits = new char[8];

            eightBits[0] = fourBitsAfterXor[0];
            eightBits[1] = fourBitsAfterXor[1];
            eightBits[2] = fourBitsAfterXor[2];
            eightBits[3] = fourBitsAfterXor[3];
            eightBits[4] = fourBit[0];
            eightBits[5] = fourBit[1];
            eightBits[6] = fourBit[2];
            eightBits[7] = fourBit[3];

            //System.out.println(eightBits);
            dec = IPI(eightBits);
            String.valueOf(dec);
        }
    }

    private static char[] xor(char[] inputOne, char[] inputTwo) {
        char[] output = new char[inputOne.length];
        for (int i = 0; i < inputOne.length; i++) {
            if ((inputOne[i] == '1' && inputTwo[i] == '1') || (inputOne[i] == '0' && inputTwo[i] == '0')) {
                output[i] = '0';
            } else {
                output[i] = '1';
            }
        }
        return output;
    }

    private static char[] EP(char[] input) {
        char[] output = new char[8];
        output[0] = input[3];
        output[1] = input[0];
        output[2] = input[1];
        output[3] = input[2];
        output[4] = input[1];
        output[5] = input[2];
        output[6] = input[3];
        output[7] = input[0];
        return output;
    }

    private static char[] IP(char[] input) {
        char[] output = new char[8];
        output[0] = input[1];
        output[1] = input[5];
        output[2] = input[2];
        output[3] = input[0];
        output[4] = input[3];
        output[5] = input[7];
        output[6] = input[4];
        output[7] = input[6];
        return output;
    }

    private static char[] IPI(char[] input) {
        char[] output = new char[8];
        output[0] = input[3];
        output[1] = input[0];
        output[2] = input[2];
        output[3] = input[4];
        output[4] = input[6];
        output[5] = input[1];
        output[6] = input[7];
        output[7] = input[5];
        return output;
    }

    private static char[][] keyGenerator(char[] inpputKey) {
        char[] keyAfterP10 = p10(inpputKey);

        char[] leftFive = new char[5];
        char[] rightFive = new char[5];

        leftFive[0] = keyAfterP10[0];
        leftFive[1] = keyAfterP10[1];
        leftFive[2] = keyAfterP10[2];
        leftFive[3] = keyAfterP10[3];
        leftFive[4] = keyAfterP10[4];
        rightFive[0] = keyAfterP10[5];
        rightFive[1] = keyAfterP10[6];
        rightFive[2] = keyAfterP10[7];
        rightFive[3] = keyAfterP10[8];
        rightFive[4] = keyAfterP10[9];

        //Circular shift one both	
        leftFive = circularShiftOne(leftFive);
        rightFive = circularShiftOne(rightFive);

        char[] key1 = p8(merge(leftFive, rightFive));

        //Circular Shift Two both	
        leftFive = circularShiftTwo(leftFive);
        rightFive = circularShiftTwo(rightFive);

        char[] key2 = p8(merge(leftFive, rightFive));

        return new char[][]{key1, key2};
    }

    private static char[] merge(char[] leftFive, char[] rightFive) {
        char[] output = new char[10];

        output[0] = leftFive[0];
        output[1] = leftFive[1];
        output[2] = leftFive[2];
        output[3] = leftFive[3];
        output[4] = leftFive[4];
        output[5] = rightFive[0];
        output[6] = rightFive[1];
        output[7] = rightFive[2];
        output[8] = rightFive[3];
        output[9] = rightFive[4];

        return output;
    }

    private static char[] circularShiftOne(char[] input) {
        char[] output = new char[5];
        output[0] = input[1];
        output[1] = input[2];
        output[2] = input[3];
        output[3] = input[4];
        output[4] = input[0];
        return output;
    }

    private static char[] circularShiftTwo(char[] input) {
        char[] output = new char[5];
        output[0] = input[2];
        output[1] = input[3];
        output[2] = input[4];
        output[3] = input[0];
        output[4] = input[1];
        return output;
    }

    private static char[] p10(char[] input) {
        char[] output = new char[10];
        output[0] = input[2];
        output[1] = input[4];
        output[2] = input[1];
        output[3] = input[6];
        output[4] = input[3];
        output[5] = input[9];
        output[6] = input[0];
        output[7] = input[8];
        output[8] = input[7];
        output[9] = input[5];
        return output;
    }

    private static char[] p8(char[] input) {
        char[] output = new char[8];
        output[0] = input[5];
        output[1] = input[2];
        output[2] = input[6];
        output[3] = input[3];
        output[4] = input[7];
        output[5] = input[4];
        output[6] = input[9];
        output[7] = input[8];
        return output;
    }

    private static char[] p4(char[] input) {
        char[] output = new char[4];
        output[0] = input[1];
        output[1] = input[3];
        output[2] = input[2];
        output[3] = input[0];
        return output;
    }

    private static char[] s0(char[] input) {
        char[] row = new char[2];
        row[0] = input[0];
        row[1] = input[3];

        char[] col = new char[2];
        col[0] = input[1];
        col[1] = input[2];

        if ((row[0] == '0') && (row[0] == '0')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'0', '0'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'1', '1'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '0'};
            }
        } else if ((row[0] == '0') && (row[1] == '1')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'1', '1'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'1', '0'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'0', '0'};
            }
        } else if ((row[0] == '1') && (row[1] == '0')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'0', '0'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'1', '0'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '1'};
            }
        } else if ((row[0] == '1') && (row[1] == '1')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'1', '1'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'1', '1'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '0'};
            }
        }
        return null;
    }

    private static char[] s1(char[] input) {
        char[] row = new char[2];
        row[0] = input[0];
        row[1] = input[3];

        char[] col = new char[2];
        col[0] = input[1];
        col[1] = input[2];

        if ((row[0] == '0') && (row[0] == '0')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'0', '0'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'1', '0'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '1'};
            }
        } else if ((row[0] == '0') && (row[1] == '1')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'1', '0'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'0', '0'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '1'};
            }
        } else if ((row[0] == '1') && (row[1] == '0')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'1', '1'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'0', '0'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '1'};
            }
        } else if ((row[0] == '1') && (row[1] == '1')) {
            if ((col[0] == '0') && (col[1] == '0')) {
                return new char[]{'1', '0'};
            } else if ((col[0] == '0') && (col[1] == '1')) {
                return new char[]{'0', '1'};
            } else if ((col[0] == '1') && (col[1] == '0')) {
                return new char[]{'0', '0'};
            } else if ((col[0] == '1') && (col[1] == '1')) {
                return new char[]{'1', '1'};
            }
        }
        return null;
    }
}
