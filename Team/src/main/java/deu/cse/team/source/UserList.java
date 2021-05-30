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
public class UserList implements FileInterface{
    ArrayList<String> Areadinfo = new ArrayList();
    ArrayList<String> Ureadinfo = new ArrayList();
    ArrayList<String> Breadinfo = new ArrayList();
    ArrayList<UserInfo> userinfo = new ArrayList<>();
    ArrayList<AdminInfo> admininfo = new ArrayList<>();
    ArrayList<UserInfo> blackinfo = new ArrayList<>();
    
    @Override
    public void FRead() {
        try {
            File Stext = new File("C:\\DB\\userList.txt");
            FileReader textRead = new FileReader(Stext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                Ureadinfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void ARead() {
        try {
            File Atext = new File("C:\\DB\\adminID.txt");
            FileReader textRead = new FileReader(Atext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                Areadinfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void BRead() {
        try {
            File Btext = new File("C:\\DB\\blackList.txt");
            FileReader textRead = new FileReader(Btext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                Breadinfo.add(line);
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
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\userList.txt",true));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    public void LWrite(String a) throws IOException {
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\loginlog.txt",false));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    public void UWrite(String a) throws IOException {
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\currentUser.txt",false));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    
    @Override
    public void Split() {
        String line;

        for (int i = 0; i < Ureadinfo.size(); i++) {
            line = Ureadinfo.get(i);
            String[] str = line.split("\t");
            userinfo.add(new UserInfo(str[0],str[1],str[2],str[3],str[4],str[5],str[6]));
        }
    }
    public void ASplit() {
        String line;
        
        for (int i = 0; i < Areadinfo.size(); i++) {
            line = Areadinfo.get(i);
            String[] str = line.split("\t");
            admininfo.add(new AdminInfo(str[0],str[1]));
        }
    }
    public void BSplit() {
        String line;
        
        for (int i = 0; i < Breadinfo.size(); i++) {
            line = Breadinfo.get(i);
            String[] str = line.split("\t");
            blackinfo.add(new UserInfo(str[0],str[1],str[2],str[3],str[4],str[5],str[6]));
        }
    }
    
    public ArrayList<UserInfo> returUserinfo() throws IOException {
        return userinfo;
    }
    
    public ArrayList<AdminInfo> returAdmininfo() throws IOException {
        return admininfo;
    }
    
    public ArrayList<UserInfo> returnBlackinfo() throws IOException {
        return blackinfo;
    }
}
