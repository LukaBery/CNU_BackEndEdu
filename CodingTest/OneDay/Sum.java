package CodingTest.OneDay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = Integer.parseInt(sc.nextLine());
        String inputVal = sc.nextLine();

        String[] arr1 = inputVal.split(" ");
        int[] arr2 = new int[inputLength];
        for(int i=0; i<inputLength; i++){

            arr2[i] = Integer.parseInt(arr1[i]);
        }
        int qnaLength = Integer.parseInt(sc.nextLine());
        String[] arr3 = new String[qnaLength];  // qna array
        for(int i =0; i<qnaLength; i++){
            arr3[i] = sc.nextLine();
        }
        for(int i =0; i<qnaLength; i++){
            int[] arr_2 = new int[2];
            for(int j=0; j<2; j++){
                String[] s = arr3[i].split(" ");
                arr_2[j] = Integer.parseInt(s[j]);
            }
            int sum = 0;
            for(int h=arr_2[0]-1; h<arr_2[1]; h++){
                sum = sum + arr2[h];
            }
            System.out.println(sum);
        }



    }
}
