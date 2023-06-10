/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Interfaces.PantallaCalculadora;



/**
 *
 * @author HanselChavez
 */
public class Main { 
  
    public static void main(String[] args)     
    {   
        PantallaCalculadora calculadora = new PantallaCalculadora();
        calculadora.setLocationRelativeTo(null);
        calculadora.setVisible(true);
    }    
}

    
