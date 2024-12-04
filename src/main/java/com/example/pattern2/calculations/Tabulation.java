package com.example.pattern2.calculations;

public class Tabulation {
    private double[] xValues;
    private double[] yValues;

    public Tabulation() {
    }

    public void calculate(double start, double end, double step) {
        int n = (int) countStep(start, end, step);
        xValues = new double[n];
        yValues = new double[n];

        for (int i = 0; i < n; i++) {
            xValues[i] = start + i * step;
            yValues[i] = function(xValues[i]);
        }
    }

    private double function(double x) {
        if (x <= 0) throw new IllegalArgumentException("x должен быть больше 0 для варианта 1");
        return Math.tan(x) / Math.log(x);
        }


    public double countStep(double start, double end, double step) {
        if (start == end) return 0;
        return (int) ((end - start) / step + 1);
    }

    public double getX(int i) {
        return xValues[i];
    }

    public double getY(int i) {
        return yValues[i];
    }

    public double[] getXArr() {
        return xValues;
    }

    public double[] getYArr() {
        return yValues;
    }
}
