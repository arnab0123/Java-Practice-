package com.practice.arnab.array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ArrayFind {

    private int[] numbers;
    private int length;
    private int k;

    public ArrayFind() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Length : ");
        length = scan.nextInt();
        numbers = new int[length];
        System.out.print("Enter the numbers : ");
        for (int i = 0; i < length; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.print("Enter K : ");
        k = scan.nextInt();

    }

    public void leftRotateKpoition() {
        for (int j = 0; j < k; j++) {
            leftRotateOnePoition();
        }
    }

    public void rightRotateKpoition() {
        for (int j = 0; j < k; j++) {
            rightRotateOnePoition();
        }
    }

    public void rightRotateOnePoition() {
        int temp = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = temp;
    }

    public void leftRotatekpoitionbyOneloop() {
        int[] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int d = (i + numbers.length - k) % numbers.length;
            System.out.println("Source : " + i + "\t Dest : " + d);
            temp[d] = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = temp[i];
        }
    }

    public void leftRotateOnePoition() {
        int temp = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[(i + numbers.length - 1) % numbers.length] = numbers[i];

        }
        numbers[numbers.length - 1] = temp;
    }

//    public void print() {
//        for (int n : numbers) {
//            System.out.print(n + ", ");
//        }
//        System.out.println("");
//    }
    public int smallestIndex() {
        int smallNumber = 9999999;
        int smallIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallNumber) {
                smallNumber = numbers[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public int kthNumber() {
        int smallestNumber = 999999;
        for (int i = 0; i < k; i++) {
            int index = smallestIndex();
            smallestNumber = numbers[index];
            numbers[index] = 99999;
        }
        return smallestNumber;
    }

    public boolean pallindrome() {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] != numbers[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPermutation(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public void print() {
        System.out.println(pallindrome());
    }

    public static void matrixPrint(int[][] M) {
        System.out.println("{");
        for (int[] x : M) {
            System.out.print("  {");
            for (int i = 0; i < x.length; i++) {
                int p = x[i];
                System.out.print(p);
                if (i != x.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
        System.out.println("}");
    }

    public static int[][] matrixmulti(int[][] first, int[][] second) throws Exception {
        int row1 = first.length;
        int col1 = first[0].length;

        int row2 = second.length;
        int col2 = second[0].length;
        if (col1 != row2) {
            throw new IllegalArgumentException("");
        }
        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                int r = 0;
                for (int k = 0; k < col1; k++) {
                    r += (first[i][k] * second[k][j]);
                }
                result[i][j] = r;
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] input) {
        int row1 = input.length;
        int col1 = input[0].length;
        int[][] r = new int[col1][row1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                r[j][i] = input[i][j];
            }
        }
        return r;
    }

    public static int[][] martixAdd(int[][] first, int[][] second) throws IllegalArgumentException {
        int row1 = first.length;
        int col1 = first[0].length;

        int row2 = second.length;
        int col2 = second[0].length;

        if (row1 != row2 || col1 != col2) {
            throw new IllegalArgumentException("Incompatible Matrices");
        }
        int[][] sum = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {

                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        return sum;
    }

    public static int[] add(int a, int b) {
        return new int[]{a, b};
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int foo(int a, int b) {
        return divide(a, b);
    }

    public static int bar(int a, int b) throws Exception {
        try {
            return foo(a, b);
        } catch (ArithmeticException ex) {
            throw new Exception("ami already dhore felsi");
        }
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void addOne(int[][] X) {
        int r = X.length;
        int c = X[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                X[i][j] += 1;
            }
        }
    }

    public static void transposeWithOneArray(int[][] square) {
        int r = square.length;
        int c = square[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = square[i][j];
                square[i][j] = square[j][i];
                square[j][i] = temp;
            }
        }

    }

    public static void transposeSquareMatrix(int[][] X) throws IllegalArgumentException {
        int r = X.length;
        int c = X[0].length;
        int[][] s = new int[c][r];
        if (r != c) {
            throw new IllegalArgumentException("Not a square matrix");
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                s[j][i] = X[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                X[i][j] = s[i][j];
            }
        }
    }
    
    public static double dotFuntion(double[] A,double[]B)throws IllegalArgumentException{
        if(A.length != B.length){
            throw new IllegalArgumentException("lengths do not match");
        }
        double result = 0;
        for(int i = 0; i < A.length; i++){
            result += (A[i] * B[i]);
        }
        return result;
    }
    public static double determinent(double[] D){
        double result = 0;
        for(double d:D){
            result +=(d *d);
        }
       return Math.sqrt(result);
    }
    public static double angleOfVectors(double[] A, double[] B){
        double dp = dotFuntion(A, B);
        double dA = determinent(A);
        double dB = determinent(B);
        double dD = dp / (dA * dB);
       return Math.acos(dD);
    }
    

    public static void Test(String[] args) {
        /*ArrayFind arr = new ArrayFind();
        int result = arr.kthNumber();
        System.out.println("Result : " + result);
        arr.print();
        arr.leftRotateOnePoition();
        arr.leftRotatekpoitionbyOneloop();
        arr.print();
        arr.pallindrome();
        arr.print();*/
        //System.out.println("Hello " + (2 + 3));
//        int[][] X = {
//            {1, 3, 4, 7},
//            {2, 4, 6, 5},
//            {4, 5, 7, 6},
//            {4, 1, 4, 3}
//
//        };
//        int[][] Y = {
//            {2},
//            {5},
//            {1},};
//        ArrayFind.matrixPrint(X);
//        ArrayFind.matrixPrint(Y);
//        try{
//            int[][] result = ArrayFind.matrixmulti(X, Y );
//            ArrayFind.matrixPrint(result);
//        } catch (Exception arnab){
//            arnab.printStackTrace();
//        }
//        ArrayFind.matrixPrint(X);
//        ArrayFind.addOne(X);
//        ArrayFind.transposeSquareMatrix(X);
//        ArrayFind.matrixPrint(X);
//          ArrayFind.transposeWithOneArray(X);
//          ArrayFind.matrixPrint(X);
          /*double[] X ={2,4,6,8,5};
          double[] Y ={2,4,6,8,5};
          System.out.println(
                180 * ArrayFind.angleOfVectors(X, Y) / Math.PI
          );*/
          
    }

}
