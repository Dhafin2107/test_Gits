package com.example.demo;
import java.util.*;

//name : Dhafin Taufiqi
//Univ : Universitas Pendidikan Indonesia

public class DenseRanking {
    public static void main(String[] args) {
        int[] skorPemain = {100, 100, 50, 40, 40,20, 10};
        int[] skorUser = {5, 25, 50, 120};

        int[] skorPemainUnik = removeDuplicates(skorPemain);
        System.out.print("hasil dari ranking user : ");

        for (int i = 0; i < skorUser.length; i++) {
            int rangking = getRangking(skorPemainUnik, skorUser[i]);

            System.out.print(rangking + " ");
        }

    }

    //Method untuk menghapus duplikasi
    private static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    // Method untuk menghitung rangking
    private static int getRangking(int[] skorPemain, int skorUser) {
        int rangking = 1;
        for (int skor : skorPemain) {
            if (skor > skorUser) {
                rangking++;
            }
        }
        return rangking;
    }
}
