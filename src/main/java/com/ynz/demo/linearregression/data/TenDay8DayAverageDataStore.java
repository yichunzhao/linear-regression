package com.ynz.demo.linearregression.data;

import org.springframework.stereotype.Component;

@Component
public class TenDay8DayAverageDataStore implements Accessible {

    @Override
    public double[][] getData() {
        double[][] data = {
                {0D, 374.83},
                {1D, 375.72},
                {2D, 378.01},
                {3D, 382.00},
                {4D, 384.38},
                {5D, 386.50},
                {6D, 386.93},
                {7D, 386.52},
                {8D, 386.46},
                {9D, 384.63}
        };
        return data;
    }

}
