public class RomanNumerals {
    static StringUtil stringUtil = new StringUtil();

    static int[] digits = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String encode(int number) {
        int currentNumber = number;
        String result = "";
        for (int i = 0; i < digits.length; i++)
            while (currentNumber >= digits[i]) {
                result = result + numerals[i];
                currentNumber -= digits[i];
            }
        return result;
    }

    public int decode(String numeral) {
        int result = 0;
        String remainingChars = numeral;

        for (int i = 0; i < digits.length; i++) {
            int currDigit = digits[i];
            String currSymbol = numerals[i];
            while (stringUtil.take(currSymbol.length(), remainingChars).equals(currSymbol)) {
                result         = result + digits[i];
                remainingChars = stringUtil.drop(currSymbol.length(), remainingChars);
            }
        }
        return result;
    }
}
