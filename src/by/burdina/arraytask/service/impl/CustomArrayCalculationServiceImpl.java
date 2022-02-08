package by.burdina.arraytask.service.impl;

import by.burdina.arraytask.exception.CustomException;
import by.burdina.arraytask.service.CustomArrayCalculationService;
import by.burdina.arraytask.entity.CustomArray;

public class CustomArrayCalculationServiceImpl implements CustomArrayCalculationService {

    @Override

    public int findMinNum(CustomArray entity) throws CustomException {
        int[] array = entity.getArray();
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }


    @Override

    public int findMaxNum(CustomArray entity) throws CustomException {

        int[] array = entity.getArray();
        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;

    }


    @Override

    public int findMidNum(CustomArray entity) throws CustomException {

        int[] array = entity.getArray();
        int sum = 0;
        int midNum = sum / array.length;

        for (int i : array) {
            sum += i;
        }

        return midNum;
    }


    @Override

    public void negativeNumToZero(CustomArray entity) throws CustomException {

        int[] array = entity.getArray();
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }

    @Override


    public int sum(CustomArray entity) throws CustomException {

        int[] array = entity.getArray();
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }


    @Override

    public int positiveNumCount(CustomArray entity) throws CustomException {

        int count = 0;
        int[] array = entity.getArray();

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0){
                count++;
            }
        }
        return count;
    }


    @Override

    public int negativeNumCount(CustomArray entity) throws CustomException {

        int count = 0;
        int[] array = entity.getArray();

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0){
                count++;
            }
        }
        return count;
    }
}
