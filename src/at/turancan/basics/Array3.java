package at.turancan.basics;


    import java.util.Arrays;
import java.util.Collections;

    public class Array3 {

        public static void main(String[] args) {
            int[] array1 = {8, 3, 2, 22, 8, 1};
            Integer[] array2 = {3, 1672, 291, 431, 1};

            Arrays.sort(array1);
            Arrays.sort(array2, Collections.reverseOrder());

            System.out.println("Array 1: " + Arrays.toString(array1));
            System.out.println("Array 2: " + Arrays.toString(array2));
        }

    }


