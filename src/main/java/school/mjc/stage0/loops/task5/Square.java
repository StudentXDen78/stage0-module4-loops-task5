package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        char eight = '8';
        side(sideLength);
        System.out.println();

        for (int i = 0; i < sideLength - 2; i++) {
            for (int a = 0; a < sideLength; a++) {
                if (a == 0 || a == sideLength - 1) System.out.print(eight);
                else System.out.print(" ");
            }
            System.out.println();
        }

        side(sideLength);
    }

    public void side(int sideLength) {
        char eight = '8';
        for (int i = 0; i < sideLength; i++) {
            System.out.print(eight);
        }
    }
}