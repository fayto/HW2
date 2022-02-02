package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        String[] out = new String[arr.length];
        for (int i = 0; i<arr.length; i++) {
            if (i >= 2) {
                out[i-2] = arr[i];
            }
            else {
                out[out.length + i - 2] = arr[i];
            }
        }
        for (String i:out) {
            System.out.print(i + " ");
        }
    }
}
