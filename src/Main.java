import java.util.Arrays;

import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {

        double[] digits = {4.0, 12.2, -5.5, 7.0, -3.4, 6.1, -9.5, -1.0, 2.5, -2.0, 2.0, 1.5, -8.5, 4.0, -3.2};
        System.out.println(Arrays.toString(digits));
        double average = 0;
        double sum = 0;
        int kol = 0;
        boolean otr = false;
        for (double i : digits) {
            if (i < 0) {
                otr = true;
            } else if (otr) {
                sum+=i;
                kol++;
            }

        }
        average=sum/kol;
        System.out.println("Average of sum "+sum+" and "+kol+" numbers equals "+average);

        System.out.println(Arrays.toString(digits));
        sort(digits);
        System.out.println(Arrays.toString(digits));



    }
    public static void sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            double min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }




        }

