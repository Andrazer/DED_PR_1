package edu.uoc.ds.adt;

public class PR1Aux {

    public static boolean isPrimo(int n){

        // Comprueba si el número es primo y devuelve true si lo es

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) return false;

        }
        return true;

    }
}
