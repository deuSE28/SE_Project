/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.Delivery;

import java.util.Iterator;

/**
 *
 * @author qjqmf
 */
public interface Aggregate extends Iterator<String> {
    public abstract Iterator<String> createIterator();
}


