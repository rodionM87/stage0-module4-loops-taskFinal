package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int count = 1;

        for (int limit = 10; count <= limit; count++) {
            int equals = count * numberTableToPrint;
            System.out.println(count + " x " + numberTableToPrint + " = " + equals);
        }
    }
}
