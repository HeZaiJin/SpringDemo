package control;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/28.
 */

@Controller
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserControler {

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam String name, @RequestParam String pwd) {
        System.out.println("request login : name " + name + ", pwd : " + pwd);
        User user = new User("haozhang", "123456", "男", 25);
        return JSON.toJSONString(user);
    }
}
