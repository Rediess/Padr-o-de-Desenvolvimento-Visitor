/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comvisitor.estrutura;

import comvisitor.estrutura.Elemento;

/**
 *
 * @author Juliano
 */
public class ElementoConcreto extends Elemento {
    
    public void Accept (Visitor visitor) {
        visitor.visit(this);
       super.Accept(visitor);
    }
    
    
}
