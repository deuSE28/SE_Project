/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.product_registration;

/**
 *
 * @author qjqmf
 */
public abstract class CategoryComponent {
    public void add(CategoryComponent component) {
        throw new UnsupportedOperationException();
    }
    
    public CategoryComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
 
    public void print() {
        throw new UnsupportedOperationException();
    }
 
    public void getDeparName() {
        throw new UnsupportedOperationException();
    }
}
