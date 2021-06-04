/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.bbs;

import javax.swing.ImageIcon;

/**
 *
 * @author 916
 */
public class Proxy_Image implements ImageInterface {
    private Real_Image realImage;
    private String imgLocation;
    private int width, height;
    
    public Proxy_Image(String imgLocation, int width, int height) {
        this.imgLocation = imgLocation;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public ImageIcon displayImage() {
        if (realImage == null) {
            realImage = new Real_Image(imgLocation, width, height);
        }
        return realImage.displayImage();
    }
}