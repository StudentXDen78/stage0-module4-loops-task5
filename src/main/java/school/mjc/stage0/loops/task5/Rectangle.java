package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        char eight = '8';
        side(length);
        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            for (int a = 0; a < length; a++) {
                if (a == 0 || a == length - 1) System.out.print(eight);
                else System.out.print(" ");
            }
            System.out.println();
        }

        side(length);
        System.out.println();
    }

    public void side(int length) {
        char eight = '8';
        for (int i = 0; i < length; i++) {
            System.out.print(eight);
        }
    }
}
