package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int middle = sideLength / 2;
        for (int i = 0; i < sideLength; i++) {
            if (i == middle) {
                for (int a = 0; a < sideLength; a++) {
                    System.out.print("8");
                }
                System.out.println();
                continue;
            }
            side(sideLength);
            System.out.println();
        }
    }

    public void side(int sideLength) {
        int middle = sideLength / 2;
        for (int i = 0; i < sideLength; i++) {
            if (i == middle) {
                System.out.print("8");
                continue;
            }
            System.out.print(" ");
        }
    }
}
