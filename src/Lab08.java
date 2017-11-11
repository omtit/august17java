public class Lab08 {
    public static double task3946(String x) {
        if (x == ""){
            return 0;
        }
        String strings[] = x.split(" ");
        int arr1[] = new int[strings.length];
        double b = 0;
        for (int j = 0; j < strings.length; j++) {
            arr1[j] = Integer.parseInt(strings[j]);
            b = b + arr1[j];
        }
        return b/strings.length;
    }
}
