/**
 * Created by pro-28 on 06.10.2017.
 */
public class Lab06 {
    public static int task1544(int b) throws Exception {
        if (b<-10){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        if (b>10000){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        return (b*(b+1))/2 - ((-10-1)*((-10-1)+1))/2;}


    public static int task9180(int A) throws Exception {
        if (A < -100 || A > 500) {
            throw new Exception("Значение A должно быть в интервале [-100, 500]");
        }
        int sum = 0;
        while (-100 <= A && A <= 500) {
            sum = sum + A;
            A = A + 1;
        }
        return (sum);
    }

    public static double task2802(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("Значение N должно быть положительным");
        }

        double a = 1;
        double number = 0;
        while (a <= n) {
            number = number + (1 / a);
            a++;
        }

        return number;

    }
}

