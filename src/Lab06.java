/**
 * Created by pro-27 on 06.10.2017.
 */
public class Lab06 {
    public static double task2802(int n) throws Exception {
        if(n <= 0) {
            throw new Exception("Значение N должно быть положительным");
        }

        double a = 1;
        double number = 0;
        while(a <= n) {
            number = number + (1 / a);
            a++;
        }

        return number;
    }
}
