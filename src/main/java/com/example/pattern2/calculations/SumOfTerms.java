package com.example.pattern2.calculations;
import lombok.AllArgsConstructor;
import static java.lang.Math.sin;
@AllArgsConstructor
public class SumOfTerms {

    // Метод для вычисления ряда функции sin(x)/x
    public double sinXOverXSeries(double x, int terms) {
        if (x == 0) {
            return 1; // sin(0)/0 = 1
        }

        double result = 1.0; // Первое слагаемое (n = 0: 1)
        double currentTerm = 1.0; // Начальное слагаемое
        int sign = -1; // Следующее слагаемое имеет отрицательный знак

        for (int n = 1; n < terms; n++) {
            // Вычисляем текущее слагаемое из предыдущего
            currentTerm *= (x * x) / ((2 * n) * (2 * n + 1));
            result += sign * currentTerm;
            sign *= -1; // Чередование знаков
        }

        return result;
    }

    // Метод для вычисления факториала
    private long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Сравнение точного значения с аппроксимацией
    public double compareSinXOverX(double x, int terms) {
        double approxValue = sinXOverXSeries(x, terms);
        double exactValue = sin(x) / x;
        return Math.abs(exactValue - approxValue);
    }

    public double getSumOfElementsBiggerThanE(double x, double terms, double e) {
        if (x <= -1 || x >= 1) {
            throw new IllegalArgumentException("x должен быть в диапазоне (-1, 1)");
        }

        double result = 0.0;
        int count = 0;

        for (int n = 1; n <= terms; n += 2) {
            double term = Math.pow(x, n) / n;
            if (Math.abs(term) > e) {
                result += term;
                count++;
            }
        }

        System.out.println("Количество слагаемых больше " + e + ": " + count);
        return 2 * result;
    }
    public double getSum(double x, double terms) {
        if (x <= -1 || x >= 1) {
            throw new IllegalArgumentException("x должен быть в диапазоне (-1, 1)");
        }
        double result = 0.0;
        for (int n = 1; n <= terms; n += 2) {
            result += (Math.pow(x, n) / n);
        }
        return 2 * result;
    }
    public double logSeries(double x, double terms) {
        double result = 0.0;
        for (int n = 1; n <= terms; n += 2) {
            result += (Math.pow(x, n) / n);
        }
        return 2 * result;
    }
    public double exactLogValue(double x) {
        return sin(x)/x;

    }
    public double compare(double x, double terms){
        double approxValue = logSeries(x, terms);
        double exactValue = exactLogValue(x);
        return Math.abs(exactValue - approxValue);
    }
}
