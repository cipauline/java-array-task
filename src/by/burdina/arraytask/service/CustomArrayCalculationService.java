package by.burdina.arraytask.service;

import by.burdina.arraytask.entity.CustomArray;
import by.burdina.arraytask.exception.CustomException;

public interface CustomArrayCalculationService {

    int findMaxNum(CustomArray entity) throws CustomException;

    int findMinNum(CustomArray entity) throws CustomException;

    int findMidNum(CustomArray entity) throws CustomException;

    void negativeNumToZero(CustomArray entity) throws CustomException;

    int sum(CustomArray entity) throws CustomException;

    int positiveNumCount(CustomArray entity) throws CustomException;

    int negativeNumCount(CustomArray entity) throws CustomException;

}


