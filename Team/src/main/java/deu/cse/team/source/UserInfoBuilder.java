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
public class UserInfoBuilder {
    private String id;
    private String pw;
    private String name;
    private String email;
    private String phone;
    private String birth;
    private String residence;

    public UserInfoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserInfoBuilder setPw(String pw) {
        this.pw = pw;
        return this;
    }

    public UserInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserInfoBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserInfoBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserInfoBuilder setBirth(String birth) {
        this.birth = birth;
        return this;
    }

    public UserInfoBuilder setResidence(String residence) {
        this.residence = residence;
        return this;
    }
    
    public UserInfo build(){
        UserInfo userInfo = new UserInfo(id, pw, name, email, phone, birth, residence);
        return userInfo;
    }
    
}
