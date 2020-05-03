package branchingPrograms;

public class Task4 {
    public static void main(String[] args) {
        // Размеры отверстия:
        int a = 10, b = 10;
        // Размеры кирпича:
        int x = 6, y = 5, z = 4;

        if ((x <= a) && (y <= b) || (y <= a) && (x <= b) || (x <= a) && (z <= b) || (z <= a) && (x <= b) ||
            (z <= a) && (y <= b) || (y <= a) && (z <= b)) {

            System.out.println("Кирпич пройдет в отверстие");
        } else {
            System.out.println("Кирпич НЕ пройдет");
        }
    }
}
