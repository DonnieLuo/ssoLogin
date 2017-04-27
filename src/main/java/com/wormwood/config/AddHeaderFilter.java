package com.wormwood.config;

import com.wormwood.DTO.User;
import com.wormwood.helper.AddHeaderRequestWrapper;
import com.wormwood.helper.AddParamHttpRequestWrapper;
import com.wormwood.helper.Constant;
import com.wormwood.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Donnie on 2017/4/26.
 */
public class AddHeaderFilter extends HttpServlet implements Filter {
    private final Logger log = LoggerFactory.getLogger(AddHeaderFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Autowired
    private UserService userService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = loadUserByUsername(userDetails.getUsername());

        if (Constant.MPAConstant.ROLETYPE_MPA.equals(user.getRoleType())) {

            AddHeaderRequestWrapper requestWrapper = new AddHeaderRequestWrapper((HttpServletRequest) request);
            log.debug("------mpa user login verify success");
            requestWrapper.addHeader("sm_user", user.getUserName());
            requestWrapper.addHeader("member", user.getRole());
            requestWrapper.addHeader("mpa_email", "liuzhongyin@wormwood.com.sg;zhaofang@wormwood.com.sg");
            chain.doFilter(requestWrapper, response);
//            request = requestWrapper;
//            requestWrapper.getRequestDispatcher("/index").forward(requestWrapper, response);

        }
        if (Constant.MPAConstant.ROLETYPE_MAR.equals(user.getRoleType())) {
            AddParamHttpRequestWrapper requestWrapper = new AddParamHttpRequestWrapper((HttpServletRequest) request);
            requestWrapper.addParameter("sessid", String.valueOf(user.getId()));
            request = requestWrapper;
            request.getRequestDispatcher("/index").forward(request, response);
            log.debug("------marinet user login verify success");
            chain.doFilter(requestWrapper, response);
        }
    }
    private User loadUserByUsername(String username) {
        userService = new UserService();
        return userService.findByName();
    }

    @Override
    public void destroy() {

    }
}
