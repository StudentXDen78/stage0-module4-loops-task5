package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < height / 2; i++) {
            // if (i == height / 2 ) continue;
            int s = i;
            while (s > 0) {
                System.out.print(" ");
                s--;
            }

            for (int a = i; a < height - i; a++) {
                System.out.print("8");
            }

            int d = i;
            // if (s == d) continue;
            while (d > 0) {
                System.out.print(" ");
                d--;
            }
            System.out.println();
        }

        int c = 0;
        if (height % 2 == 0) c = 1;
        for (int i = height / 2  - c; i > -1; i--) {
            // if (i == height / 2 ) continue;
            int s = i;
            while (s > 0) {
                System.out.print(" ");
                s--;
            }

            for (int a = i; a < height - i; a++) {
                System.out.print("8");
            }

            int d = i;
            while (d > 0) {
                System.out.print(" ");
                d--;
            }
            System.out.println();
        }
    }
}
