/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author 구본영
 */
public class SignUp implements FileInterface {

    ArrayList<String> readinfo = new ArrayList<>();
    ArrayList<SignUpdataInfo> signupinfo = new ArrayList<>();
    
    @Override
    public void FWrite(String a) throws IOException {
        BufferedWriter BFW = new BufferedWriter(new FileWriter("C:\\DB\\userList.txt", true));
        PrintWriter pw = new PrintWriter(BFW, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();   
    }
    
    @Override
    public void FRead() {
        try {
            File text = new File("C:\\DB\\userList.txt");
            FileReader textRead = new FileReader(text);
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
    public void Split() {
        String line;

        for (int i = 0; i < readinfo.size(); i++) {
            line = readinfo.get(i);
            String[] str = line.split(" ");
            signupinfo.add(new SignUpdataInfo(str[0],str[1],str[2],str[3],str[4],str[5],str[6]));
        }
    }
    
    public ArrayList<SignUpdataInfo> returnSignUpInfo() throws IOException {
        return signupinfo;
    }
}
