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
    private String pw_check;
    private String name;
    private String email;
    private String phonenum;
    private String birth;
    private String residence;
    
    
    
    public SignUpdataInfo(String id, String pw, String name, String email, String phonenum, String birth, String residence){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.phonenum = phonenum;
        this.birth = birth;
        this.residence = residence;
        
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

    public String getPw_check() {
        return pw_check;
    }

    public void setPw_check(String pw_check) {
        this.pw_check = pw_check;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String region) {
        this.residence = residence;
    }
    
}
