package linearPrograms;

public class Task6 {
    public static void main(String[] args) {
        /* координаты точки (не в облости) */
        int x = 3, y = -4;

        boolean isTrue = (y <= 4 && x >= -2 && x < 0 || x <= 4 && y >= -3 && y < 0 || y <= 4 && x <= 2 && x > 0 && y > 0 || x >= -4 && y >= -3 && x < 0 && y < 0);

        System.out.println(isTrue);
    }
}
