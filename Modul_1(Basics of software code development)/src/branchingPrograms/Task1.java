package branchingPrograms;

public class Task1 {
    public static void main(String[] args) {
        int a = 30, b = 70;

        if (180 - a - b != 0 && a != 0 && b != 0) {
            System.out.print("Треугольник существует ");
        } else {
            System.out.print("Треугольник не существует");
        }

        if (180 - a - b != 0 && 180 - a - b == 90 || 180 - a - b != 0 && a == 90 || 180 - a - b != 0 && b == 90) {
            System.out.print("Да, существует и вляется прямоугольным.");
        }
    }
}
