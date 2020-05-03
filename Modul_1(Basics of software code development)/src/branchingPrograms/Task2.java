package branchingPrograms;

public class Task2 {
    public static void main(String[] args) {
        int a = 400, b = 100, c = 700, d = 480;
        System.out.println(max(min(a, b), min(c, d)));
    }

    private static int min(int a, int b) {
        int minValue = 0;
        if(a < b){
            minValue = a;
        }else{
            minValue = b;
        }
        return minValue;
    }

    private static int max(int a, int b) {
        int maxValue = 0;
        if(a > b){
            maxValue = a;
        }else{
            maxValue = b;
        }
        return maxValue;
    }
}
