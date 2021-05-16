/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddeu.cse.team;

/**
 *
 * @author qjqmf
 */
public class FactoryOfRegistrationProduct {
    public void createProduct(String type) {
        RegistrationProduct_Interface re_interface = null;
        switch(type){
            case "Cloth":
                re_interface = new Kategorie_Cloth();
            
            case "Game" : 
                re_interface = new Kategorie_Game();
                break;
        }
        
        re_interface.createPrice();
        re_interface.createState();
    }
}
