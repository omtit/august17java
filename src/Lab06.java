/**
 * Created by pro-28 on 06.10.2017.
 */
public class Lab06 {
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
}
