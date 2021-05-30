/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.product_registration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author qjqmf
 */
public class Category_composite extends CategoryComponent {
     private String name;
     private ArrayList <CategoryComponent> components = new ArrayList<CategoryComponent>();
 
    public Category_composite(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void add(CategoryComponent component) {
        this.components.add(component);
    }
 
    public CategoryComponent getChild(int i) {
        return components.get(i);
    }
 
    public void print() {
        try {
            File f1 = new File("C:\\DB\\RegistrationProduct.txt");
            FileWriter writer = new FileWriter(f1, true);
            writer.write(getName() + "\t");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("오류발생");
        }
        Iterator<CategoryComponent> iterator = components.iterator();
        while(iterator.hasNext()) {
            CategoryComponent component = iterator.next();
            component.print();
        } 
    }
}
