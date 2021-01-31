package com.ynz.demo.linearregression.data;


import org.springframework.stereotype.Component;

@Component
public class TSLADarkTimePrices implements Accessible {

    @Override
    public double[][] getData() {
        double[][] data = {
                {0D, 121.00},
                {1D, 121.60},
                {2D, 126.85},
                {3D, 112.11},
                {4D, 109.32},
                {5D, 89.01},
                {6D, 86.04},
                {7D, 72.24},
                {8D, 85.53},
                {9D, 85.51}
        };

        return data;
    }
}
