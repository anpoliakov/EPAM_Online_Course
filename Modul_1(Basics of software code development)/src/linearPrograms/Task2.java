package linearPrograms;

public class Task2 {
    public static void main(String[] args) {
        double k, a = 8, b = 6, c = 3;

        k = (b + Math.sqrt( Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow( a, 3) * c) + Math.pow( b, -2);

        System.out.printf("%.3f", k);
    }
}
