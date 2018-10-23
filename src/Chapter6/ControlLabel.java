package Chapter6;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }

    public void printTimesTable() {
        startNumber:
        for (int number = 2; number < 10; number++) {
            for (int unit = 1; unit < 10; unit++) {
                if (number == 4) continue startNumber;
                System.out.println(number + "*" + unit + "=" + number * unit + "");
            }
            System.out.println();
        }

    }
}
