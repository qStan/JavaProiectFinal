/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptii;

/**
 *
 * @author lili
 */
public class NrTelefonInvalidException extends IllegalArgumentException{
    private String NrTelefonInvalid;
    
    public NrTelefonInvalidException(String s){
        NrTelefonInvalid = s; 
    }
}
