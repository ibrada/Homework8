import java.util.Arrays;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {

// Task 1
// Task 1.1
        int[] abc = new int[]{1, 2, 3};

// Task 1.2
        double[] xyz = {1.57d, 7.654d, 9.986d};

// Task 1.3
        String[] clothes = {"trousers", "shirt", "jacket"};

// Task 2
// Task 2.1
        abc = new int[]{1, 2, 3};
        for (int index = 0; index < abc.length; index++) {
            if (index == abc.length - 1) {
                System.out.println(abc[index]);
                break;
            }
            System.out.print(abc[index] + ", ");
        }

// Task 2.2
        for (int index = 0; index < xyz.length; index++) {
            if (index == xyz.length - 1) {
                System.out.println(xyz[index]);
                break;
            }
            System.out.print(xyz[index] + ", ");
        }

// Task 2.3
        for (int index = 0; index < clothes.length; index++) {
            if (index == clothes.length - 1) {
                System.out.println(clothes[index]);
                break;
            }
            System.out.print(clothes[index] + ", ");
        }

// Task 3
// Task 3.1
        for (int i = abc.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(abc[i]);
                break;
            }
            System.out.print(abc[i] + ", ");
        }

// Task 3.2
        for (int i = xyz.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(xyz[i]);
                break;
            }
            System.out.print(xyz[i] + ", ");
        }

// Task 3.3
        for (int i = clothes.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(clothes[i]);
                break;
            }
            System.out.print(clothes[i] + ", ");
        }

// Task 4
        for (int index = 0; index < abc.length; index++) {
            if (abc[index] % 2 == 0 && index == abc.length - 1) {
                System.out.println(abc[index]);
                break;
            }
            if (abc[index] % 2 != 0 && index == abc.length - 1) {
                System.out.println(abc[index] + 1);
                break;
            }
            {
                if (abc[index] % 2 == 0) {
                    System.out.print(abc[index] + ", ");
                } else {
                    System.out.print(abc[index] + 1 + ", ");
                }
            }
        }


    }
}