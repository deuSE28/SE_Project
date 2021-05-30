/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.Delivery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author qjqmf
 */
public class Product {
    private List<String> list = new ArrayList<String>();
 
    public void add(String name){
        list.add(name);
    }
}
