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

public class MemberJoin {

    public String join(String id, String pw, String name, String email, String phone, String birth, String residence) {
        // TODO code application logic here
        File file = new File("..\\MemberDB.txt");
        try {
            FileWriter filewriter = new FileWriter(file, true);
            if (file.isFile() && file.canWrite()) {
                filewriter.append(id);
                filewriter.append("\t");
                filewriter.append(pw);
                filewriter.append("\t");
                filewriter.append(name);
                filewriter.append("\t");
                filewriter.append(email);
                filewriter.append("\t");
                filewriter.append(phone);
                filewriter.append("\t");
                filewriter.append(birth);
                filewriter.append("\t");
                filewriter.append(residence);
                filewriter.append("\r");
            }
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    
}
