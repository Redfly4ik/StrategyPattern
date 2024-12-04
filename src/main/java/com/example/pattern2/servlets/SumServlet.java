package com.example.pattern2.servlets;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.pattern2.CalculationStrategy;
import com.example.pattern2.SumCalculationStrategy;
import com.example.pattern2.model.Result;

@WebServlet(name = "calculate", value = "/calculate")
public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");

        CalculationStrategy strategy = new SumCalculationStrategy();
        Result result = strategy.calculate(request);

        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/sum.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
