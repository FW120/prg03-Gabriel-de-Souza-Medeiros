/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author gabri
 */
public class ClasseFatorial {
    
    public static long setValor(long fatorial) {
        
        if(fatorial==0) {
            return fatorial+1L;
            
        } else if(fatorial<0) {
            return 0L;
        }
        return fatorial*ClasseFatorial.setValor(fatorial-1);
    }
    public static String getFormula(long formula) {
        
        String reFormula=String.valueOf(formula);
        
        while(formula!=0) {
            formula--;
            if(formula==0) break;
            reFormula=reFormula+"x";
            reFormula=reFormula+formula;
        }
        return reFormula;
    }
    
}
