package com.fnkaya.algorithms;

public class SandWatch {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int result = hourglassSum(arr);

        System.out.println(result);
    }

    private static int hourglassSum(int[][] arr) {
        int kumSaatiBoyutu = 3;
        int result = 0;

        for (int i = 0; i <= kumSaatiBoyutu; i++) {
            for (int j = 0; j <= kumSaatiBoyutu; j++) {
                int toplam = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if (toplam > result) {
                    result = toplam;
                }
            }
        }

        return result;
    }
}
