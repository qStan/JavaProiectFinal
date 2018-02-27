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
public class NumeInvalidException extends IllegalArgumentException{
    private String numeInvalid;
    
    public NumeInvalidException(String s){
        numeInvalid = s; 
    }
}
