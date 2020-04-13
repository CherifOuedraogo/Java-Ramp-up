package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary){
       this.real = real + getReal();
       this.imaginary = imaginary + getImaginary();
    }
    public void add(ComplexNumber complexNumber){
        this.real = real + complexNumber.getReal();
        this.imaginary = imaginary + complexNumber.getImaginary();
    }
    public void subtract (double real, double imaginary){
        this.real = getReal() - real;
        this.imaginary = getImaginary()- imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        this.real = real - complexNumber.getReal();
        this.imaginary = imaginary - complexNumber.getImaginary();
    }
    
}
