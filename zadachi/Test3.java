package gas.zadachi;

import java.util.Arrays;
public class Test3 {
    public static void number(double[] array) {
        double nums = array[0];
        double nums1 = array[0];

        int i;
        for (i = 1; i < array.length; i++) {

            if (array[i] > nums) {
                nums = array[i];
            }
        }
        if (array[i] < nums1) {
            nums1 = array[i];
        }
        System.out.println("Возвращает число: " + nums);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05,3.14,8.0,9.19,-3.0};
        number(array1);
    }
}
