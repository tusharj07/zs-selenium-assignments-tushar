package org.utils.java;
import java.util.Random;
import java.lang.Math;
public class RandomNumUtils {

    public static int random(int digits) {
            Random rad=new Random();
            int m = (int) Math.pow(10, digits - 1);
            return  m + rad.nextInt((10 * m))-1;

        }
}
