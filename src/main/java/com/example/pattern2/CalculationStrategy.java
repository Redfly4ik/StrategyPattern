package com.example.pattern2;

import jakarta.servlet.http.HttpServletRequest;
import com.example.pattern2.model.Result;

public interface CalculationStrategy {
    Result calculate(HttpServletRequest request);
}

