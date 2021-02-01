package com.ynz.demo.linearregression.solver;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApacheMathSolver implements RegressionSolver {
    private final DecimalFormat df = new DecimalFormat("0.00");
    private final SimpleRegression simpleRegression;

    @Override
    public int isXYPositiveRelated(double[][] dataSet) {
        //clean up solver
        simpleRegression.clear();

        //add solver data
        simpleRegression.addData(dataSet);

        double slop = simpleRegression.getSlope();
        double intercept = simpleRegression.getIntercept();
        double r = simpleRegression.getR();
        double rSquare = simpleRegression.getRSquare();

        log.info("slop: " + df.format(slop) + " intercept: " + df.format(intercept) + " R: " + df.format(r) + " R square: " + df.format(rSquare));

        return slop > 0 ? 1 : -1;
    }
}
