/**
 * Created by Александр on 27.09.2017.
 */
public class Lab02 {
    public static double task4411(double x) {
        return 2 * x;
    }

    public static double task4366(int x1, int x2) {
        return Math.sqrt(Math.pow(x2, 2) + Math.pow(x1, 2));
    }


    public static double task3943(double x, double y) throws Exception {
        if (y < 0) {
            throw new Exception("Значение y должно быть неотрицательным");
        }
        if ((x+Math.sqrt(y)) < 0) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
            return -5 * Math.sqrt((x + Math.sqrt(y)));
        }

    }
