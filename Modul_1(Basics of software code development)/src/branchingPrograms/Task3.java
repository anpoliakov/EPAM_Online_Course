package branchingPrograms;

public class Task3 {
    public static void main(String[] args) {
        int pointX1 = 198, pointY1 = 199; // Точка 1
        int pointX2 = 198, pointY2 = 199; // Точка 2
        int pointX3 = 198, pointY3 = 199; // Точка 3

        if (((pointX1 - pointX3) * (pointY2 - pointY3)) == ((pointX2 - pointX3) * (pointY1 - pointY3))) {
            System.out.println("ОК: Точки лежат на одной прямой");
        } else {
            System.out.println("Точки НЕ лежат на одной прямой!");
        }
    }
}
