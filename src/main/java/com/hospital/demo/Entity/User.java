package com.hospital.demo.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "app_user")
public class User extends DistributedEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        @Column(nullable = false, length = 30)
        private String ism;

        @Column(length = 30)
        private String familiya;

        @NotNull
        @Column(nullable = false, length = 30, unique = true)
        private String login;

        @NotNull
        @Column(nullable = false, length = 60)
        private String parol;
        private Role role;
        private LocalDateTime regVaqt;
        private LocalDateTime oxirgiTashrif;

        private Boolean aktiv;

        @ManyToOne
        private Fayl rasm;

        public Fayl getRasm() {
                return rasm;
        }

        public void setRasm(Fayl rasm) {
                this.rasm = rasm;
        }

        @Override
        public Long getId() {
                return id;
        }

        @Override
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

        public String getParol() {
                return parol;
        }

        public void setParol(String parol) {
                this.parol = parol;
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

        public LocalDateTime getOxirgiTashrif() {
                return oxirgiTashrif;
        }

        public void setOxirgiTashrif(LocalDateTime oxirgiTashrif) {
                this.oxirgiTashrif = oxirgiTashrif;
        }

        public Boolean getAktiv() {
                return aktiv;
        }

        public void setAktiv(Boolean aktiv) {
                this.aktiv = aktiv;
        }

}

