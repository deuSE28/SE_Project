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
public class UserInfo {
    private String id;
    private String pw;
    private String name;
    private String email;
    private String phone;
    private String birth;
    private String residence;
    
    public UserInfo(String id, String pw, String name, String email, String phone, String birth, String residence){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birth = birth;
        this.residence = residence;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirth() {
        return birth;
    }

    public String getResidence() {
        return residence;
    }
    
    public String getUserInfo(){
        String userInfo = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s"
                ,id,pw,name,email,phone,birth,residence);
        return userInfo;
    }
}
