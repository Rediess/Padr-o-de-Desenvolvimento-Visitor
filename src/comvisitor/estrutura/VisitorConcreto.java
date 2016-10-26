/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comvisitor.estrutura;

import comvisitor.estrutura.Visitor;
import comvisitor.estrutura.ElementoConcreto;

/**
 *
 * @author Juliano
 */
public class VisitorConcreto implements Visitor{
    
    @Override
    public void visit(ElementoConcreto elementoConcreto){
        System.out.println("Estou Visitando: " + elementoConcreto.getClass().getName());
    }
    
}
