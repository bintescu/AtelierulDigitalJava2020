package lab1.Homework;

import java.util.ArrayList;
import java.util.List;

public class CodeChallenge4 {

    public static int number_of_pairs(int [] arr,int n) {
        int number_of_pairs = 0;
        List<Integer> indecsi_folositi = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> indecsi_prezenti = new ArrayList<>();
                    indecsi_prezenti.add(i);
                    indecsi_prezenti.add(j);
                    indecsi_prezenti.add(k);
                    if (arr[i] + arr[j] + arr[k] == 0 && !indecsi_folositi.containsAll(indecsi_prezenti)) {
                        number_of_pairs++;

                    }
                    indecsi_folositi.add(i);
                    indecsi_folositi.add(j);
                    indecsi_folositi.add(k);
                }
            }


        }

        return number_of_pairs;
    }

    public static void main(String[] args) {
        System.out.println(number_of_pairs(new int[]{-1,-1,-1,2},4));
    }
}
