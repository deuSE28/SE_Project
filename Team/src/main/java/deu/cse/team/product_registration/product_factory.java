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
public class product_factory {
    public static product getproduct(product_abstractfactory pd_abf){
        return pd_abf.createproduct();
    }
}
