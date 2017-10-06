public class Lab07 {
    public static int task9631(String x) throws Exception {
        String str = "abcdefwxyz";
        int a;
        if (str.contains(x)) {
            a = 9 - str.indexOf(x);
            return a;
        } else {
            throw new Exception("Значение отсутствует в строке");
        }

    }
}
