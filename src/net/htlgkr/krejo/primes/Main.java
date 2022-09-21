package net.htlgkr.krejo.primes;

import java.net.Socket;

//inspiration von http://public.beuth-hochschule.de/~solymosi/lehre/eratosthenes/Sieb.html
public class Main {
    private final int MAX = 160;//(int)Math.sqrt(max)+2;
    private boolean[] numbers = new boolean[MAX];
    private int[] primes = new int[MAX];
    private int counter = 0;
    public static void main(String[] args) {
        Main m = new Main();
        for (int i = 2; i < m.MAX; i += 2) {
            m.numbers[i] = true;
        }
        for (int prime = 3; prime < m.MAX; prime += 2) {
            if (m.numbers[prime] == false) {
                m.primes[m.counter] = prime;
                m.counter++;
                for (int i = 2; prime * i < m.MAX; i++) {
                    m.numbers[prime * i] = true;
                }
            }
        }
        for (int i = 0; i < m.MAX; i++) {
            System.out.println(m.primes[i]);
        }
    }
}
