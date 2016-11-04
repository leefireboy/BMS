package com.libing.bms.base;

import com.libing.bms.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by libing on 2016/11/4.
 */
public abstract class BaseController {

    public static final String LOGIN_USER_SESSION = "Access-User-Session";

    protected HttpServletRequest getRequest() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            throw new RuntimeException("非法 HTTP 请求");
        }
        return attributes.getRequest();
    }

    protected User getLoginUser() {
        return (User) getRequest().getSession().getAttribute(LOGIN_USER_SESSION);
    }

    protected void login(User user) {
        getRequest().getSession().setAttribute(LOGIN_USER_SESSION, user);
    }

}
