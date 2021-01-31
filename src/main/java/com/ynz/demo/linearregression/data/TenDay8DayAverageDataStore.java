package com.ynz.demo.linearregression.data;

import org.springframework.stereotype.Component;

@Component
public class TenDay8DayAverageDataStore implements Accessible {

    @Override
    public double[][] getData() {
        double[][] data = {{0D, 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D}, {374.83, 375.72, 378.01, 382.00, 384.38, 386.50, 386.93, 386.52, 386.46, 384.63}};
        return data;
    }

}
