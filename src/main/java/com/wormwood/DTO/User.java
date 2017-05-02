package com.wormwood.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by kasimodo on 2016-07-22.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
    @Id
    private Integer id;
    private String username;
    private String password ;

    @Column(name = "org_code")
    private String companyOrgCode;
    @Column(name = "co_name")
    private String companyName;
    @Column(name = "role")
    private String role;
    @Column(name = "role_type")
    private String roleType;
    @Column(name = "email")
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return password;
    }

    public void setUserPassword(String userPassword) {
        this.password = userPassword;
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
