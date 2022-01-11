/*
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, 
 * and zero. Print the decimal value of each fraction on a new line with  
 * places after the decimal.
 */

import java.util.List;

public class plusMinus {
    public static void plusMinus(List<Integer> arr) {
    double pos = 0, neg = 0, zero = 0, total = 0;
    for(int i = 0; i < arr.size(); i++){
        if(arr.get(i) == 0){zero++;}
        else if(arr.get(i) > 0){pos++;}
        else{neg++;} 
        total++;
    }
    System.out.println(pos/total);
    System.out.println(neg/total);
    System.out.println(zero/total);
    }

}
