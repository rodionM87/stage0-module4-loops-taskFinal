package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int countStar = cathetusLength;
        
        for (int count = 1; count <= cathetusLength; count++) {
            
            for (int firstLimit = 1; firstLimit < countStar; firstLimit++) {
                System.out.print(" ");
            }
            for (int secondLimit = countStar; secondLimit <= cathetusLength; secondLimit++) {
                System.out.print("*");
            }
            System.out.println();
            countStar--;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
