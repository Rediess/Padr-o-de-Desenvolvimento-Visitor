/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comvisitor.estrutura;

import comvisitor.estrutura.ElementoConcreto;

/**
 *
 * @author Juliano
 */
public interface Visitor {
    
    public void visit(ElementoConcreto elementoConcreto);
         
    
    
}
