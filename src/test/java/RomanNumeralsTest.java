import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    int[] testDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 35, 740};
    String[] testNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XXXV", "DCCXL"};

    @Test
    public void decodeAllTheRomans() {
        for (int i = 0; i < testDigits.length; i++) {
            assertEquals(romanNumerals.decode(testNumerals[i]), testDigits[i]);
        }
    }

    @Test
    public void encodeAllTheRomans() {
        for (int i = 0; i< testDigits.length; i++) {
            assertEquals(romanNumerals.encode(testDigits[i]), testNumerals[i]);
        }
    }
}
