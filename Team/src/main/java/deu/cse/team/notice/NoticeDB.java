/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.notice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author 구본영
 */
public class NoticeDB {
    String noticeinfo = "";
    public void FRead() {
        try {
            File text = new File("C:\\DB\\notice.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                noticeinfo = noticeinfo + line + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void FWrite(String a) throws IOException {
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\notice.txt",false));
        PrintWriter pw = new PrintWriter(log,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
    }
    
    public String returnNoticeinfo() throws IOException {
        return noticeinfo;
    }
}
