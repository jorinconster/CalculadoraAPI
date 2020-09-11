package com.devops.calculadoraAPI.modelo;

import org.springframework.stereotype.Component;

@Component
public class Operaciones {


    public double suma(double n1, double n2) {
        return n1+n2;
    }

    public  double resta(double n1, double n2) {
        return n1-n2;
    }

    public double multiplicacion(double n1, double n2) {
        return n1*n2;
    }

    public double division(double n1, double n2){
        return (n2 != 0)? n1/n2 : 0;
    }

}