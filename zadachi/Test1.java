package gas.zadachi;

import java.util.Locale;

public class Test1 {
    public static void main(String[] args) {
        double[] crednums = {1.1,2.1,3.6,5.4,};
        double result = 0;

        for (double d : crednums) {
            result += d;
        }
        System.out.println("Среднее значение чисел: " + result /crednums.length);
    }
}
