package linearPrograms;

public class Task5 {
    public static void main(String[] args) {
        int totalTime = 7250;

        int hh = totalTime / 3600;
        int mm = (totalTime % 3600) / 60;
        int ss = (totalTime % 3600) % 60;

        System.out.println(hh + "ч-" + mm + "мин-" + ss + "с");
    }
}
