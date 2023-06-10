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
public class ExcepcionFormatoNumerico extends Exception {

    static final String MESSAGE = "Error al ingresar los valores, solo números.";
    public ExcepcionFormatoNumerico() {
        super(MESSAGE);
    }
    
}
