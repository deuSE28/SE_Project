/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.product_registration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author qjqmf
 */
public class Product extends CategoryComponent{
    String name;
    String price;
    String image;
    String quantity;
    String explanation;
    String trandingarea;
    String status;
    
    public Product(String name, String price, String image, String quantity, String explanation, String trandingarea, String status) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.quantity = quantity;
        this.explanation = explanation;
        this.trandingarea = trandingarea;
        this. status = status;
    }
 
    public String getName() {
        return name;
    }
 
    public String getPrice() {
        return price;
    }
    public String getImage() {
        return image;
    }
    public String getQuantity() {
        return quantity;
    }
    public String getExplanation() {
        return explanation;
    }
    public String getTrandingarea() {
        return trandingarea;
    }
    public String getStatus() {
        return status;
    }
    
    public void print() {
        try {
            File f1 = new File("C:\\DB\\RegistrationProduct.txt");
            FileWriter writer = new FileWriter(f1, true);
            BufferedReader br = new BufferedReader(new FileReader("C:\\DB\\currentuser.txt"));
            String user = br.readLine();
            writer.write(user + "\t");
            writer.write(getName() + "\t");
            writer.write(getPrice() + "\t");
            writer.write(getImage() + "\t");
            writer.write(getQuantity() + "\t");
            writer.write(getExplanation() + "\t");
            writer.write(getTrandingarea() + "\t");
            writer.write(getStatus() + "\n");
            writer.flush();
            writer.close();
            br.close();
        } catch (IOException e) {
            System.out.println("오류발생");
        }
    }
}
