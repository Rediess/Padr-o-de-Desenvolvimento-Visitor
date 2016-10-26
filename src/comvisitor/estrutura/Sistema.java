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
public class Sistema {
    
    public static void main(String[] args){
        ElementoConcreto elementoConcreto = new ElementoConcreto();
        VisitorConcreto visitorConcreto = new VisitorConcreto();
        elementoConcreto.Accept(visitorConcreto);
    }
    
}
