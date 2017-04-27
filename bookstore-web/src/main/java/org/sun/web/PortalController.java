package org.sun.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

/**
 * Created by Mr.sun on 2017/4/18.
 */
@Controller
public class PortalController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping(value = "/")
    String toLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    String doLogin() {
        return "abc";
    }

}
