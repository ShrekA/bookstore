package org.sun.web;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mr.sun on 2017/4/18.
 */
@Controller
public class PortalController {


    @GetMapping(value = "/")
    String toLogin() {
        return "login";
    }

    @PostMapping(value = "/dologin")
    @ResponseBody
    String doLogin(@NotNull String account, @NotNull String passwd) {
        System.out.print(account + passwd + "~~~~~~~~~~~~~~~~~~~~~");
        if (account.equals("sunny") && passwd.equals("123456"))
            return "success";
        else
            return "fail.";

    }

}
