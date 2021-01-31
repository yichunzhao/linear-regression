package com.ynz.demo.linearregression.solver;

public interface RegressionSolver {

    /**
     * determine how dependent var. is related with independent var.
     *
     * @return int 1: positive related; 0: cannot be determined; -1: negative related
     */
    int isXYPositiveRelated();
}
