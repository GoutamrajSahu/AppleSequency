//Question:
//There is an array of A's and O's. A atands for Apple, O stands for Orange.
//We have M number of spells, each spell allows us to convert an orange into an apple.
//
//Find the longest sequency of apples you can make, given an array and the value of M.
//
//Example 1:
//Input:
//N = 5
//M = 1
//arr[] = 'AAOAO'
//Output:
//4
//Explanation: Changing the orange at 3rd position into an apple gives us the maximum
//possible answer.

package com.company;

import java.util.*;
public class Main
{
    public static void main(String [] argh)
    {
        Scanner Sc = new Scanner(System.in);
        int N;
        int count = 0;
        System.out.println("Enter N: ");
        N = Sc.nextInt();
        int M;
        System.out.println("Enter M: ");
        M = Sc.nextInt();

        System.out.println("Enter the array elements: ");
        char arr[] = new char[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = Sc.next().charAt(0);
        }
        int i = 0;
        while(M!=0){
            if(Character.compare(arr[i], 'O')==0){
                M--;
                arr[i] = 'A';
            }
            i++;
            if(i == arr.length){
                break;
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(Character.compare(arr[j],'O') == 0){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
