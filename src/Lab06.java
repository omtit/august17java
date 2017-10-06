public class Lab06 {
    public static int task1544(int b) throws Exception {
        if (b<-10){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        if (b>10000){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        return (b*(b+1))/2 - ((-10-1)*((-10-1)+1))/2;
    }
}
