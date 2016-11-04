package com.libing.bms.web;

import com.libing.bms.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by libing on 2016/11/4.
 */
@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login() {
        return "";
    }

}
