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
public class CnpInvalidException extends IllegalArgumentException{
    
    private String cnpInvalid;
    
    public CnpInvalidException(String s){
        cnpInvalid = s; 
    }
}
