/**
 * Created by Александр on 27.09.2017.
 */
public class Lab02 {
    public static double task4411(double x){
        return 2*x;
    }

    public static double task4366(int x1, int x2) {
        return Math.sqrt(Math.pow(x2, 2) + Math.pow(x1, 2));
    }

    public static double task9020(int x) throws Exception {
        if (61 - x < 0) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return 3 * Math.sqrt(61 - x);

    }

    public static double task7237(double temperatureInC) throws Exception {
        if(temperatureInC < -273.15) {
            throw new Exception("Температура должна быть выше абсолютного нуля");
        }
        return (temperatureInC * 1.8) + 32;

    }

    public static double task8873(int r1, int r2) throws Exception {
        if (r1==0) {
            throw new Exception("Значение r1 должно быть не равно нулю");
        }
        if (r2==0) {
            throw new Exception("Значение r2 должно быть не равно нулю");
        }
        return (1/r1)+(1/r2);
    }
}
