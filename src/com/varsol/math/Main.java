package com.varsol.math;

import com.varsol.math.controllers.NController;
import com.varsol.math.models.NNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by simon on 22.03.17.
 */
public class Main {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 6, 3, 0));
        arr.add(5, 2);


        System.out.print(Arrays.asList(arr));
    }

}
