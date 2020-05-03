package branchingPrograms;

public class Task5 {
    public static void main(String[] args) {
        double f, x = 4;

        if(x <= 3){
            f = Math.pow(x, 2) - 3*x + 9;
            System.out.println(f);

        }else if(x>3){
            f=1/(Math.pow(x,3)+6);
            System.out.printf("%.3f",f);

        }
    }
}
