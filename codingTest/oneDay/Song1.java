package codingTest.oneDay;

import java.util.Scanner;

public class Song1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = Integer.parseInt(sc.nextLine());
        String[] titleList = new String[testNum];
        int[] timeList = new int[testNum];
        for (int i = 0; i < testNum; i++) {
            titleList[i] = sc.nextLine();
        }
        timeList[0] = Integer.parseInt(sc.nextLine());
        for (int i = 1; i < testNum; i++) {
            timeList[i] = timeList[i - 1] + Integer.parseInt(sc.nextLine());
        }
        int qnaNum = Integer.parseInt(sc.nextLine());
        String[] output = new String[qnaNum];
        for (int j = 0; j < qnaNum; j++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num > 0 && num <= timeList[0]) {
                output[j] = titleList[0];
            }
            for (int h = 0; h < testNum - 1; h++) {
                if (num > timeList[h] && num <= timeList[h + 1]) {
                    output[j] = titleList[h + 1];
                    break;
                }
            }
        }
        for(int i=0; i<qnaNum; i++){
            System.out.println(output[i]);
        }
    }
}
