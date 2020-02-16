package com.company;

/*



 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws Exception {
        HashSet<String> hashSet = new HashSet<>();
        String arr[] = {"арбуз" , "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        for (int i=0; i<10; i++) {
            hashSet.add(arr[i]);
        }
        for (String x : hashSet) {
            System.out.println(x);
        }
    }
}








