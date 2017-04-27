package org.sun.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
