package codingTest.oneDay;

import java.util.Scanner;

public class Ant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countWall = 0;
        int countComma = 0;
        int wrong = 0;
        String message = "";

        for(int i = 0; i< s.length(); i++){
            char help = s.charAt(i);
            if(help == '.'){
                ++countComma;
            }else if(help == '#'){
                ++countWall;
            }else ++wrong;
        }

        if (countWall> 1) message = "HELP!";
        else if (countWall <= 1) message = "HAHA!";
        System.out.println(message);

    }
}
