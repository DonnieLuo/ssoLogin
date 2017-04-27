package com.wormwood.service;

import com.wormwood.DTO.User;
import org.springframework.stereotype.Service;

/**
 * Created by Donnie on 2017/4/25.
 */
@Service
public class UserService {
    public User findByName() {
        User user = new User();
        user.setRole("CN=PF_AO,CN=PF_OFFR,OU=MPAINTRANET,DC=gov,DC=sg");
        user.setCompanyName("company");
        user.setCompanyOrgCode("com");
        user.setUserName("donnie");
        user.setUserPassword("donnie");
        user.setRoleType("mpa");
        return user;
    }
}
