package Day02;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //21140114
        Random ran = new Random();
        int score[];
        score = new int[60];
        for (int i = 0; i < score.length; i++) {
            score[i] = ran.nextInt(100) + 1;
        }
        for (int i = 0; i < 60; i++) {
            System.out.println("学号为" + (i + 1) + "的同学的Java成绩为" + score[i]);
        }
        System.out.println();
    }
}
