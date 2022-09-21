package net.htlgkr.krejo.primes;

import java.net.Socket;

//inspiration von http://public.beuth-hochschule.de/~solymosi/lehre/eratosthenes/Sieb.html
public class Main {
    private final int MAX = 160;//(int)Math.sqrt(max)+2;
    private int[] numbers = new int[MAX];
    public static void main(String[] args) {
        Main m = new Main();
        for (int i = 2; i < m.MAX; i*=2) {
                m.numbers[i] = 1;
            }
        for (int prime = 3; prime < m.MAX ; prime+=2) {
            if (m.numbers[prime] == 0){
                m.numbers[prime] = 2;
                for (int i = 2; prime *i  < m.MAX; i++) {
                    m.numbers[prime*i] = 1;
                }
            }
        }
        System.out.println("2 2 ");
        for (int i = 0; i < m.MAX; i++) {
            System.out.println(i + ": " + m.numbers[i] + " ");
        }
    }
}
