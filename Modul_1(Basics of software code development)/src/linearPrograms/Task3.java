package linearPrograms;

public class Task3 {
    public static void main(String[] args) {
        double k, x = 12, y = 10, t = 10, g = 12;

        k = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * t * g * x * y;

        System.out.printf("%.3f", k);
    }
}
