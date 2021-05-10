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
public class abstractfactory_product_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        product cloth = product_factory.getproduct(new cloth_factory());
        product game = product_factory.getproduct(new game_factory());
        
        System.out.println(cloth.getName());
        System.out.println(game.getName());
    }
    
}
