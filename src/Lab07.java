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

    public static int task9812(String ca, String cb) throws Exception {
        String string = "abcdefwxyz";
        if(!string.contains(ca)) {
            throw new Exception("Значение CA отсутствует в строке");
        }

        if(!string.contains(cb)) {
            throw new Exception("Значение CB отсутствует в строке");
        }

        int a = string.indexOf(ca);
        int b = string.indexOf(cb);
        int result;
        if(a < b) {
            result = (b - 1) - a;
        } else {
            result = (a - 1) - b;
        }

        return result;

    }
}
