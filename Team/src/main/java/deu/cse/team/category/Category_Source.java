/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.category;

import deu.cse.team.source.FileInterface;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author CHANG
 */
public class Category_Source implements FileInterface{
    ArrayList<String> readinfo = new ArrayList();
    
    @Override
    public void FRead() {
        try {
            File Stext = new File("C:\\DB\\category.txt");
            FileReader textRead = new FileReader(Stext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readinfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void FWrite(String a) throws IOException {
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\category",false));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    
    public void Split() {}
}
