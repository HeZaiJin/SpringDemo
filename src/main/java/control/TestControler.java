package control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/28.
 */

@Controller
@RequestMapping(value = "/haozhang/*")
public class TestControler {

    @RequestMapping(value = "jsp")
    public String returnJSP() {
        return "/Views/success";
    }

    @RequestMapping(value = "body", produces = {"text/plain;charset=UTF-8"})
    @ResponseBody
    public String returnBody() {
        return "Come Body! 真是醉了";
    }
}
