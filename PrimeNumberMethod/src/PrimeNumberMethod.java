//This is a java program to test prime numbers

import javax.swing.*;

public class PrimeNumberMethod {
    int num;

    public PrimeNumberMethod (int number){
        this.num = num;
    }
    public static boolean isPrime(int num) {

        num = 100;
        boolean prime = false;
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                prime = true;
            }
            }
        if (!prime)
            return true;
        else
            return false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public static void main(String[] args){

    }
}
