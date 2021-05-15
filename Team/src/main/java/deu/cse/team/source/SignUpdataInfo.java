/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author 구본영
 */
public class SignUpdataInfo {
    private String id;
    private String pw;
    private String name;
    private String phonenum;

    
    
    
    public SignUpdataInfo(String id, String pw, String name, String phonenum){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phonenum = phonenum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}
