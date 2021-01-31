package com.ynz.demo.linearregression.solver;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApacheMathSolver implements RegressionSolver {
    private final SimpleRegression simpleRegression;

    @Override
    public int isXYPositiveRelated(double[][] dataSet) {
        //add solver data
        simpleRegression.addData(dataSet);

        double slop = simpleRegression.getSlope();
        double intercept = simpleRegression.getIntercept();
        double r = simpleRegression.getR();

        log.info("slop: " + slop + " intercept: " + intercept + " R: " + r);

        return slop > 0 ? 1 : -1;
    }
}
