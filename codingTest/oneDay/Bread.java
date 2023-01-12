package codingTest.oneDay;

import java.util.Scanner;

public class Bread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String br1 = sc.nextLine();
        int price1 = Integer.parseInt(sc.nextLine());
        String br2 = sc.nextLine();
        int price2 = Integer.parseInt(sc.nextLine());
        if(price1> price2) System.out.println(br1);
        else if (price2> price1) System.out.println(br2);
        else if (price1 == price2) {
            System.out.println("금액이 같습니다.");

        }
    }

}
