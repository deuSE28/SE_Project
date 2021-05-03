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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("..\\MemberDB.txt");
        try {
            FileWriter filewriter = new FileWriter(file, true);
            if (file.isFile() && file.canWrite()) {
                System.out.println("아이디 입력 :");
                filewriter.append(scan.nextLine());
                filewriter.append("\t");
                System.out.println("비밀번호 입력 :");
                filewriter.append(scan.nextLine());
                filewriter.append("\r");
            }
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
