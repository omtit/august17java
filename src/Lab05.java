/**
 * Created by Александр on 27.09.2017.
 */
public class Lab05 {

    public static String task5662(int a, int b, int c){
        if (a == 0){
            return "Данное уравнение не является квадратным";
        }
        double d = b*b - 4*a*c;
        if(d > 0){
            return String.format("У уравнения %dx^2 + %dx + %d два вещественных корня", a, b, c);
        } else if (d == 0){
            return String.format("Уравнение %dx^2 + %dx + %d имеет один корень", a, b, c);
        } else {
            return String.format("Вещественных корней уравнения %dx^2 + %dx + %d = 0 нет", a, b, c);
        }
    }

    public static boolean task8878(int a, int b){
        return a < b;
    }

    public static boolean task8715(int a, int b, int c){
        return a < b && b < c;
    }

    public static double task5980(double k){
        if (k>0){
            return Math.sqrt(k);
        }
        else {
            return k*k;
        }
    }
    public static boolean task4847 ( int a, int b, int c)
    {
      return (a==b || b==c || a==c);
    }
}
