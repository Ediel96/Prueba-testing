package com.scotiabankcolpatria.hiring;

import java.util.ArrayList;
import java.util.List;

public class CreditRiskAssessment {

    public double standardDeviation(int[] paymentDelays) {
        //TODO implement.
        return -1;
    }

    public int paymentDelayMaxPeakIndex(int[] paymentDelays) {
        //TODO implement.
        return -1;
    }

    public double[] latePaymentProbabilityByPeriod(int[][] paymentDelays) {
        //TODO implement.
        return null;
    }

    public static void main(String[] args){

        int [] lista1 =  new int[]{0, 15, 2, 0, 1, 3};

        double result = 0.0;

        //numero de numero validados
        if(lista1.length >= 1){

            // tamaño de la lista
            int numberIndex = sizeIndex(lista1);
            //lista retonar que no este el cero
            int[] listNew = diffZeroList(lista1, numberIndex);
            int sum = sumList(lista1);
            result = resultDiv(sum, listNew.length);

            System.out.println(result);
        }

    }

    public static int sizeIndex(int[] lista){
        int numberIndex = 0;
        for (int i = 0 ; i < lista.length; i++){
            if(lista[i] > 0){
                numberIndex = numberIndex + 1;
            }
        }
        return numberIndex;
    }

    public static int[] diffZeroList ( int[] lista1, int numberIndex  ){

        int[] listNew = new int[numberIndex];
        int couter = 0;
        for (int i = 0 ; i < lista1.length; i++){
            if(lista1[i] > 0){
                listNew[couter] = lista1[i];
                couter = couter + 1;
            }
        }
        return listNew;
    }

    public static int sumList ( int[] lista1  ){

        int sum = 0;
        for (int i = 0 ; i < lista1.length; i++){
            sum = sum + lista1[i];
        }

        return sum;
    }

    public static double resultDiv (int sum, int total){
            double result = (double) sum/total;
        return result;
    };

}
