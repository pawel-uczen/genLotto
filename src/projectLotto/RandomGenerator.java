package projectLotto;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class RandomGenerator {
    static public byte @NotNull [] genNumbers (byte count, byte pool) {
        byte[] number = new byte[count];
        for (byte i = 0; i < count; i++) {
            number[i] = (byte) Math.round((Math.random() * (pool - 1)) + 1);
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (number[i] == number[j] && j > i) {
                    number[j] = (byte) Math.round((Math.random() * (pool - 1)) + 1);
                    i = -1;
                    break;
                }
            }
        }
        Arrays.sort(number);
        return number;

    }

}
