/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.bbs;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author 916
 */
public class Real_Image implements ImageInterface {

    ImageIcon loading = new ImageIcon("C:\\DB\\image\\loading.png");
    private ImageIcon Icon = loading;

    public Real_Image(String imgLocation, int width, int height) {
        loadFromDisk(imgLocation, width, height);
    }
    
    private void loadFromDisk(String imgLocation, int width, int height) {
        File f = new File(imgLocation);
        if(f.exists()) {
            ImageIcon imageicon = new ImageIcon(imgLocation);
            this.Icon = new ImageIcon(imageicon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        }      
    }
    
    @Override
    public ImageIcon displayImage() {
        return Icon;
    }
}
