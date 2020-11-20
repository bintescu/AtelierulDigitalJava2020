package lab1.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeChallenge2 {
    public static String compute(int number){
        StringBuilder result = new StringBuilder();
        if(number % 3 == 0){
            result.append("Foo");
        }
        if(number % 5 == 0 ){
            result.append("Bar");
        }
        if(number % 7 == 0){
            result.append("Qix");

        }

        List<Integer> digits = new ArrayList<>();
        int aux = number;
        while (aux !=0){
            digits.add(aux%10);
            aux /= 10;
        }
        for(int i = digits.size() - 1; i>=0 ; i--){
            switch (digits.get(i)){
                case(3):{
                    result.append("Foo");
                    break;
                }
                case(5):{
                    result.append("Bar");
                    break;
                }
                case(7):{
                    result.append("Qix");
                    break;
                }
            }
        }
        if(result.length() == 0){
            return  String.valueOf(number);
        }
        return result.toString();
    }

    public static String addZeroAtSpeficicPosition(String string, List<Integer> indexes){
        StringBuilder result = new StringBuilder();
        int indice = 0;
        for(int index : indexes) {
            int pozitionam_indicele = index*3;
            System.out.println("indice = " + indice + " poz_indice " + pozitionam_indicele + "  " + index);
            System.out.println(string.substring(indice,pozitionam_indicele));
            result.append(string, indice, pozitionam_indicele);


            result.append('*');
            indice=pozitionam_indicele;
        }
        result.append(string.substring(indice));
        return result.toString();
    }

    public static String compute2(int number){
        String compute_result = compute(number);
        List<Integer> indexOfZeros = new ArrayList<>();
        int aux = number;
        int number_length = 0;
        while(aux != 0){
            number_length++;
            aux /=10;
        }
        number_length --;
        aux = number;
        while (aux !=0){
            if(aux % 10 == 0){
                indexOfZeros.add(number_length);
            }
            aux /= 10;
            number_length --;
        }


        Collections.sort(indexOfZeros);
        return addZeroAtSpeficicPosition(compute_result,indexOfZeros);
    }
    public static void main(String[] args) {
        List<Integer> index =  new ArrayList<>();
        index.add(3);
        index.add(1);

        //System.out.println(addZeroAtSpeficicPosition("FooBarQixBar",index));
        System.out.println(compute2(10101));
        System.out.println(compute2(105));

    }
}
