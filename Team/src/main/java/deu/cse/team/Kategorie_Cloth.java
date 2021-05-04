/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team;

/**
 *
 * @author qjqmf
 */
public class Kategorie_Cloth implements RegistrationProduct_Interface {
    public void createPrice() {
        System.out.println("가격 : 10000");
    }
   
    public void createState() {
        System.out.println("상태 : 중고");
    }
}
