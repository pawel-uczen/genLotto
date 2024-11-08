package projectLotto;

public class LottoCmd {
    static public void main(String[] args) {
        byte count = 6;
        byte pool = 49;
        byte betNumber = 120;
        for (byte i = 0; i < betNumber; i++) {
            byte[] number = RandomGenerator.genNumbers(count, pool);
            for (byte item : number) {
                System.out.print(" " + item);
            }
            System.out.println();
        }
    }
}

