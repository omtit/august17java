
public class Lab06 {
    public static int task1544(int b) throws Exception {
        if (b<-10){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        if (b>10000){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        return (b*(b+1))/2 - ((-10-1)*((-10-1)+1))/2;}


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

