package Greedy;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class PriyankaAndToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cost = 1;
        int temp=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>temp+4){
                cost++;
                temp = a[i];
            }
        }
        System.out.println(cost);
    }
}
