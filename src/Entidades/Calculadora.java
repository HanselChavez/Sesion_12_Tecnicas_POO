/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ExcepcionesPersonalizadas.ExcepcionDividir0;

/**
 *
 * @author HanselChavez
 */
public class Calculadora {
    
    private double terminoA;
    private double terminoB;
    
    public void setValorA(double a){
        this.terminoA = a;
    }
    public void setValorB(double b){
        this.terminoB = b;
    }
    public double Sumar(){
        return terminoA+terminoB;
    }
    public double Restar(){
        return terminoA-terminoB;
    }
    public double Multiplicar(){
        return terminoA*terminoB;
    }    
    public double Dividir() throws ExcepcionDividir0 {
        if (terminoB == 0) {
            throw new ExcepcionDividir0();
        }
        return terminoA / terminoB;
    }
    
}
