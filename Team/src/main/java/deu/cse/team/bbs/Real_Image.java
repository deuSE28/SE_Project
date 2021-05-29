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
public class Real_Image implements Image {

    ImageIcon loading = new ImageIcon("C:\\DB\\image\\loading.png");
    private ImageIcon Icon = loading;

    public Real_Image(ImageIcon Icon) {
        loadFromDisk(Icon);
    }
    
    private void loadFromDisk(ImageIcon Icon) {
        this.Icon = Icon;
    }
    
    @Override
    public ImageIcon displayImage() {
        return Icon;
    }
}
