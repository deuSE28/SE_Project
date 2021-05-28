/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

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
 * @author BON
 */
public class Login_Source implements FileInterface {
    ArrayList<String> readinfo = new ArrayList();
    ArrayList<LogindataInfo> logininfo = new ArrayList<>();
    
    @Override
    public void FRead() {
        try {
            File Atext = new File("C:\\DB\\adminID.txt");
            FileReader textRead = new FileReader(Atext);
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
        try {
            File Stext = new File("C:\\DB\\userList.txt");
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
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\loginlog.txt",false));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    public void AWrite(String a) throws IOException{
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\adminID.txt",false));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    
    public void SWrite(String a) throws IOException{
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\userList.txt",true));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    
    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readinfo.size(); i++) {
            line = readinfo.get(i);
            String[] str = line.split(" ");
            logininfo.add(new LogindataInfo(str[0],str[1]));
        }
    }
    
    public ArrayList<LogindataInfo> returnLogininfo() throws IOException  {
        return logininfo;     
    }
}
