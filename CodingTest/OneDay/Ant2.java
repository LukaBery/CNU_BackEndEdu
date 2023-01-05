package CodingTest.OneDay;

import java.util.Scanner;

public class Ant2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnaNum = Integer.parseInt(sc.nextLine());
        String[] output = new String[qnaNum];

        for (int i = 0; i < qnaNum; i++) {
            String[] input = sc.nextLine().split(" ");
            int sLength = Integer.parseInt(input[0]);
            int wallNum = Integer.parseInt(input[1]);
            String input2 = sc.nextLine();
            int cIndex = input2.indexOf("@");
            int nIndex = input2.indexOf("O");
            int startIndex = 0;
            int endIndex = 0;
            if (cIndex > nIndex) {
                startIndex = nIndex;
                endIndex = cIndex;
            } else if (nIndex > cIndex) {
                startIndex = cIndex;
                endIndex = nIndex;
            }
            int wallCnt = 0;
            for (int j = startIndex; j < endIndex; j++) {
                if (String.valueOf(input2.charAt(j)).equals("#")) {
                    wallCnt++;
                }
            }
            if (wallCnt > wallNum) {
                output[i] = "HELP!";
            } else if (wallCnt <= wallNum) {
                output[i] = "HAHA!";
            }
        }
        for (int h = 0; h < qnaNum; h++) {
            System.out.println(output[h]);
        }
    }
}
