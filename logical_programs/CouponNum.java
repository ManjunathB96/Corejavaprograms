package logical_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CouponNum {
    public static void main(String[] args) {
        int number = 10;
        int couponCount= 0;
        int arrIndex= 0;
        int loopCount = 0;
        int[] record = new int[number];
        while (couponCount < number){
            int random = CouponNum.generateRandomNumber(number);
            System.out.println(random);
            if (!isExists(record,random)){
                couponCount++;
                record[arrIndex]= random;
                arrIndex++;
            }
            loopCount++;
        }
        System.out.println("total loop count :" +loopCount);
        System.out.println("total loop count :" + Arrays.toString(record));
    }

    private static boolean isExists(int[] record, int random) {
        for (int i : record){
            if(i == random){
                return true;
            }
        }
        return false;
    }

    private static int generateRandomNumber(int number) {
    return  (int)(Math.floor(Math.random()*100) ) % number+1;
    }
}
