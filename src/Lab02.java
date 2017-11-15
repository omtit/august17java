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
        if ((x + Math.sqrt(y)) < 0) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return -5 * Math.sqrt((x + Math.sqrt(y)));
    }

    public static double task7237(double temperatureInC) throws Exception {
        if (temperatureInC < -273.15) {
            throw new Exception("Температура должна быть выше абсолютного нуля");
        }
        return (temperatureInC * 1.8) + 32;

    }

    public static double task8873(int r1, int r2) throws Exception {
        if (r1 == 0) {
            throw new Exception("Значение r1 должно быть не равно нулю");
        }
        if (r2 == 0) {
            throw new Exception("Значение r2 должно быть не равно нулю");
        }
        return (1 / r1) + (1 / r2);

    }

    public static double task9020(int x) throws Exception {
        if (61 - x < 0) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return 3 * Math.sqrt(61 - x);

    }

    public static double task1346(int v, int t, int a) throws IllegalArgumentException {
        if (t <= 0) {
            throw new IllegalArgumentException("Время должно быть положительным");
        }
        if (v < 0) {
            throw new IllegalArgumentException("Начальная скорость должно быть неотрицательна");
        }
        return (v * t) + ((a * Math.pow(t, 2)) / 2);
    }

    public static double task8428(int a) {
        double b = a * Math.PI / 180;
        return b;
    }

    public static double task1262(int a) {
        double b = Math.cos(a * Math.PI / 180) * 5;
        return b;
    }


    public static double task2624(long a, long b, long c, long x) throws Exception {
        if ((a * x * x + b * x + c) < 0) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        if ((Math.sqrt(a * x * x + b * x + c) == 0)) {
            throw new Exception("Знаменатель не может быть равен нулю");
        }
        return 1.0/Math.sqrt(a * x * x + b * x + c);

    }
public static double task5871(double x) throws Exception {
        if ((x+5)<0||(x-5)<0||x <0){
            throw new Exception ("Подкоренное выражение должно быть неотрицательным");
}
        if (x==0){
            throw new Exception ("Знаменатель не может быть равен нулю");
        }
        return (Math.sqrt(x+5) + Math.sqrt(x-5)) / (2*Math.sqrt(x));
}
}