package com.humberto.coco.model;

import javax.persistence.*;

/**
 * User: Daniel Humberto Ramírez Juárez
 * Date: 25/03/19 12:10
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cd_user")
    Integer cdUser;

    @Column(name = "cd_password")
    String password;

    @Column(name = "ds_name")
    String dsName;

    public Usuario() {
    }

    public Usuario(String password, String dsName) {
        this.password = password;
        this.dsName = dsName;
    }

    public Integer getCdUser() {
        return cdUser;
    }

    public void setCdUser(Integer cdUser) {
        this.cdUser = cdUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }
}
