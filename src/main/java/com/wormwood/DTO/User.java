package com.wormwood.DTO;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kasimodo on 2016-07-22.
 */
@Entity(name = "user")
public class User implements Serializable{
    private Integer id;
    private String userName ;
    private String userPassword ;

    private String companyOrgCode;
    private String companyName;
    private String role;
    private String roleType;
    private String email;


//    private String token ;
//    private Date createDt ;
//    private Date lastLogintTime ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getCompanyOrgCode() {
        return companyOrgCode;
    }

    public void setCompanyOrgCode(String companyOrgCode) {
        this.companyOrgCode = companyOrgCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
