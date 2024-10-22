package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        StringBuilder side = new StringBuilder();
        while (cathetusLength > 0) {
            side.append("8");
            System.out.println(side);
            cathetusLength--;
        }
    }

    public static void main(String[] args) {
        printTriangle(3);
    }
}
