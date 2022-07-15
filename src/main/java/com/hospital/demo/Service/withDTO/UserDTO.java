package com.hospital.demo.Service.withDTO;

import com.hospital.demo.Entity.Fayl;
import com.hospital.demo.Entity.Role;
import com.hospital.demo.Entity.User;

import java.time.LocalDateTime;

public class  UserDTO {

    private Long id;
    private String ism;
    private String familiya;
    private String login;
    private Role role;
    private LocalDateTime regVaqt;
    private Fayl rasm;

    public UserDTO(User user) {
        this.id = user.getId();
        this.ism = user.getIsm();
        this.familiya = user.getFamiliya();
        this.login = user.getLogin();
        this.regVaqt = user.getRegVaqt();
        this.role = user.getRole();
        this.rasm = user.getRasm();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getRegVaqt() {
        return regVaqt;
    }

    public void setRegVaqt(LocalDateTime regVaqt) {
        this.regVaqt = regVaqt;
    }

    public Fayl getRasm() {
        return rasm;
    }

    public void setRasm(Fayl rasm) {
        this.rasm = rasm;
    }
}