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

    public static double task7237(double temperatureInC) throws Exception {
        if(temperatureInC < -273.16) {
            throw new Exception("Температура должна быть выше абсолютного нуля");
        }
        return (temperatureInC * 1.8) + 32;

    }
}
