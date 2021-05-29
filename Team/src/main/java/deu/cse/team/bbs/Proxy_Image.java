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
public class Proxy_Image implements Image {
    private Real_Image realImage;
    private ImageIcon Icon;
    
    public Proxy_Image(ImageIcon Icon) {
        this.Icon = Icon;
    }
    
    @Override
    public ImageIcon displayImage() {
        if (realImage == null) {
            realImage = new Real_Image(Icon);
        }
        return realImage.displayImage();
    }
}