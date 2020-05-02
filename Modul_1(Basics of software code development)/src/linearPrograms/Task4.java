package linearPrograms;

public class Task4 {
    public static void main(String[] args) {
        double r = 555.666;

        int valInt = (int) r;
        double valDouble = valInt;
        double fractPart = valDouble / 1000;
        double integerPart = (r % 1) * 1000;
        double sum = integerPart + fractPart;

        System.out.printf("%.3f", sum);
    }
}
