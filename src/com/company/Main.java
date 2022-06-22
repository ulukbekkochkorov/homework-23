package com.company;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[10];
        System.out.print("Random array: ");
        for (int i = 0; i < arr.length; i++) {
           arr[i] = random.nextInt(2);
            System.out.print(arr [i]+", ");
        }
        sort (arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, random.nextInt(2));
           }
        System.out.print("Random arrayList: " + arrayList);
        sort(arrayList);
        System.out.println(" Sorted arrayList: " + arrayList);

        LinkedList <Integer> linkedList = new LinkedList<>();

        for (int i =0; i < 10; i++) {
            linkedList.add(i,random.nextInt(2));
        }
            System.out.print("Random linkedList:" + linkedList);
        sort(linkedList);
        System.out.println(" Sorted linkedList: " + linkedList);
        }
        public static void sort(int[] arr){
            Arrays.sort(arr);
        }
        public static void sort (ArrayList<Integer> arrayList) {
            Collections.sort(arrayList);
        }
        public static void sort (LinkedList<Integer> linkedList) {
            Collections.sort(linkedList);
        }
}
