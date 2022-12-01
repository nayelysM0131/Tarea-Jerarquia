/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.jerarquia;

/**
 *
 * @author nayel
 */
public class ErrorDeBebidaException  extends ErrorEnElPedidoException{
    public ErrorDeBebidaException(){
        super("Ha ocurrido un error en las bebidas");
    }
    
    public ErrorDeBebidaException(String msj){
        super(msj);
    }
}
