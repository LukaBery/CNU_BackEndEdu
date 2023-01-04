package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numArr = input.split(" ");
        int numLength = numArr.length;
        int[] s = new int[numLength];
        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i<numLength; i++){
            s[i] = Integer.parseInt(numArr[i]);
        }
        for(int j = 0; j< 1000; j++){
            for(int h = 0; h<numLength; h++){
                if(j == s[h]){
                    result.add(s[h]);
                }
            }
        }
        System.out.println(result);
    }
}
