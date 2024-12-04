package com.example.pattern2;

import jakarta.servlet.http.HttpServletRequest;
import com.example.pattern2.calculations.Tabulation;
import com.example.pattern2.model.Result;

public class TabulationCalculationStrategy implements CalculationStrategy {
    @Override
    public Result calculate(HttpServletRequest request) {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double h = Double.parseDouble(request.getParameter("h"));

        Tabulation calcFunction = new Tabulation();
        calcFunction.calculate(a, b, h);

        double[] xArr = calcFunction.getXArr();
        double[] yArr = calcFunction.getYArr();

        return new Result(0, 0, 0, xArr, yArr);
    }
}

