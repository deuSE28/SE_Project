/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author CHANG
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int pass = 0;
        System.out.println("아이디 입력:");
        String id = scan.nextLine();
        System.out.println("비밀번호 입력:");
        String pw = scan.nextLine();
        File file = new File("..\\MemberDB.txt");
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            try {
                while ((line = bufReader.readLine()) != null) {
                    System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
                    int passId = line.indexOf(id);
                    int passPw = line.indexOf(pw);
                    if (passId != -1 && passPw != -1) {
                        System.out.println("로그인 성공");
                        pass = -1;
                    }    
                }
                if (pass == 0) {
                        System.out.println("로그인 실패");
                    }
                bufReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
