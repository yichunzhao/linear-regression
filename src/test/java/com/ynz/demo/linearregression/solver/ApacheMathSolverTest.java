package com.ynz.demo.linearregression.solver;

import com.ynz.demo.linearregression.data.TSLADarkTimePrices;
import com.ynz.demo.linearregression.data.TenDay21DayAverageDataStore;
import com.ynz.demo.linearregression.data.TenDay8DayAverageDataStore;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Slf4j
class ApacheMathSolverTest {

    @Autowired
    private ApacheMathSolver solver;

    @Autowired
    private TenDay8DayAverageDataStore tenDay8DayAverageDataStore;

    @Autowired
    private TenDay21DayAverageDataStore tenDay21DayAverageDataStore;

    @Autowired
    private TSLADarkTimePrices tslaDarkTimePrices;

    @Test
    void givenTenDay8DayAverageData_DetermineItsFactor() {
        log.info("Testing dataSet:  ten-day-8dayAverage ");
        int result = solver.isXYPositiveRelated(tenDay8DayAverageDataStore.getData());
        assertThat(result, is(1));
    }

    @Test
    void givenTwentyOneDayAverage_DetermineItsFactor() {
        log.info("Testing dataSet:  ten-day-21dayAverage ");
        int result = solver.isXYPositiveRelated(tenDay21DayAverageDataStore.getData());
        assertThat(result, is(1));
    }

    @Test
    void givenTSLADarkTimePrices_DetermineNegativeRelationship() {
        log.info("Testing dataSet:  Tesla dark time prices:  ");
        int result = solver.isXYPositiveRelated(tslaDarkTimePrices.getData());
        assertThat(result, is(-1));
    }

}