package net.htlgkr.krejo.primes;

//inspiration von http://public.beuth-hochschule.de/~solymosi/lehre/eratosthenes/Sieb.html
public class ErastosthenesPrimeSieve implements PrimeSieve {
    public ErastosthenesPrimeSieve(int p) {
        int MAX = p;
    }

    public static void main(String[] args) {
        int number = 20;
        ErastosthenesPrimeSieve e = new ErastosthenesPrimeSieve(20);
        System.out.println(number + " ist eine Primzahl : " +PrimeSieve.isPrime(number));
        PrimeSieve.printPrimes();
        System.out.println("commit 4");
    }
}
