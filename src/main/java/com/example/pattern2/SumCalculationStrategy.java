package com.example.pattern2;

import jakarta.servlet.http.HttpServletRequest;
import com.example.pattern2.calculations.SumOfTerms;
import com.example.pattern2.model.Result;

public class SumCalculationStrategy implements CalculationStrategy {
    @Override
    public Result calculate(HttpServletRequest request) {
        double x = Double.parseDouble(request.getParameter("x"));
        int n = Integer.parseInt(request.getParameter("n"));
        double e = Double.parseDouble(request.getParameter("e"));

        SumOfTerms calcFunction = new SumOfTerms();
        double sum = calcFunction.getSum(x, n);
        double sumOfElementsBiggerThanE = calcFunction.getSumOfElementsBiggerThanE(x, n, e);
        double difference = calcFunction.compare(x, n);

        return new Result(sum, sumOfElementsBiggerThanE, difference, null, null);
    }
}

