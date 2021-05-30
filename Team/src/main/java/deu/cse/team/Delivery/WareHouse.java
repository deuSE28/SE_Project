/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.Delivery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author qjqmf
 */
public class WareHouse implements Aggregate {
    private int last = 0;
    private List<String> list = new ArrayList<String>();
    
    public void add(String name){
        list.add(name);
    }
    
    public int getLength(){
        return last;
    }
    
    @Override
    public Iterator<String> createIterator() {
        return  new Iterator<String>(){
            int seq = 0;
            public boolean hasNext() {
                return  seq < list.size();
            }
            public String next() {
                return list.get(seq++);
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
