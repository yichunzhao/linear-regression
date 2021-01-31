package com.ynz.demo.linearregression.data;

import org.springframework.stereotype.Component;

@Component
public class TenDay21DayAverageDataStore implements Accessible {

    @Override
    public double[][] getData() {
        double[][] data = {
                {0D, 379.57},
                {1D, 379.34},
                {2D, 379.69},
                {3D, 380.02},
                {4D, 380.36},
                {5D, 380.87},
                {6D, 381.21},
                {7D, 381.11},
                {8D, 381.31},
                {9D, 380.41}
        };

        return data;
    }

}
