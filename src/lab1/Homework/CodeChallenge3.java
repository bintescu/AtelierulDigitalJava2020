package lab1.Homework;

import java.util.Arrays;

public class CodeChallenge3 {

    public static int number_of_pair(int [] arr, int length){
        Arrays.sort(arr);
        int number_of_pair = 0 ;
        int j = length - 1;
        int i = 0;
        while ( i < j){
            int sum = arr[i] + arr[j];
            System.out.println(" perechea : " + arr[i] + "  " + arr[j]);
            if(sum == 0) {
                number_of_pair++;
                i++;
                j--;
            }
            else if(sum > 0 ) {
                j--;
            }
            else {
                i++;
            }
        }
        return number_of_pair;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,-3,-2,3,0};
        System.out.println(number_of_pair(arr,6));

    }
}
