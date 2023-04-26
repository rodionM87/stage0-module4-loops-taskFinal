package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int multipleVar = numberToPrint;
        for (int count = 1; count < power; count++) {
            numberToPrint *= multipleVar;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
