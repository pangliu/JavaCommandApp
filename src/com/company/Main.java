package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        int testInt = 13;
        String str = "凍蒜";
//        primNum();
        printStar();
    }

    public static void printStar() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int space = num;
        /**
         * 第一個迴圈決定總共輸出幾行(需要輸出 n 行)，終止條件為 i<=n
         * 第二個迴圈決定每一行要輸出幾個 "*"，終止條件為 j<=2*i-1
         * 第三個迴圈決定每一行要輸出幾個 " "，" " 數量剛好與 "*" 相反初始值為 n 往下遞減
         */
        for(int i=1; i<=num; i++) {
            /** 每往下一層都增加 2n-1 個 */
            int bottom = 2*i -1;
            boolean isOutSpace = true;
            for (int j = 1; j <= bottom; j++) {
                /** 判斷是否要輸出空白 */
                if(isOutSpace) {
                    for (int k=space; k>0; k--) {
                        System.out.print(" ");
                        isOutSpace = false;
                    }
                    space--;
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void sum(int num) {
        int sum = 0;
        for(int i=1; i<num + 1; i++) {
            // 迴圈本體
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void primNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 2;
        boolean isPrimNum = true;
        if(0 == num%2) {
            System.out.println(num + " 2的倍數，不是質數");
            return;
        }
        while (i < num) {
            int remainder = num % i;
            if(remainder == 0) {
                isPrimNum = false;
            }
            i++;
        }
        if(isPrimNum) {
            System.out.println(num + " 是質數");
        } else {
            System.out.println(num + "不是質數");
        }
    }
}
