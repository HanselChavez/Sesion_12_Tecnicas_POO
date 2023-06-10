/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesPersonalizadas;

/**
 *
 * @author HanselChavez
 */
public class ExcepcionDividir0 extends Exception{
    private static String MESSAGE = "No es posible dividir entre 0.";
    public ExcepcionDividir0() {
        super(MESSAGE);
    }
}
