package ru.stqa.pft.sandbox;

/**
 * Created by jnorina on 27/05/2017.
 */
public class Primes {
    public static boolean isPrime (int n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
