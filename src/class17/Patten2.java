package class17;

import java.util.Scanner;

public class Patten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one digit number");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            for(int s = 1; s <= num - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
