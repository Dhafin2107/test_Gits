package com.example.demo;
//nama : Dhafin Taufiqi
//Univ : Universitas Pendidikan Indonesia

public class RumusA00012 {
    public static void main(String[] args) {

        int n = 8; // 'n' untuk inputan

        int currentNumber = 1;
        System.out.print("hasil dari inputan " + n + " adalah : " + currentNumber);

        for (int i = 2; i <= n; i++) {
            currentNumber += i - 1;
            System.out.print("-" + currentNumber); //
        }
    }
}


