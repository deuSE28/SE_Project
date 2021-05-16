/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.IOException;

/**
 *
 * @author BON
 */
public interface FileInterface {
    void FRead();
    void FWrite(String a) throws IOException;
    void Split();
}
