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
public class game_factory implements product_abstractfactory{
    @Override
    public product createproduct(){
        return new game();
    }
}
