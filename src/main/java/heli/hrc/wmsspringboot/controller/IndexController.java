package heli.hrc.wmsspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Optional;

/**
 * @PACKAGE_NAME: heli.hrc.wmsspringboot.controller
 * @NAME: IndexController
 * @USER: FSY
 * @DATE: 2023/10/9 0009
 * @TIME: 11:29
 * @YEAR: 2023
 * @MONTH_NAME_SHORT: 10月
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: wms-springboot
 * @Description:
 */
@RestController

public class IndexController {

    @RequestMapping("/")
    public String  index()
    {
        return "welcome to wms-springboot";
    }


    @RequestMapping("/test")
    public String  test()
    {
        HashMap<String, String> testParam = new HashMap<>();

        testParam.put("num1","fsy");
        testParam.put("num2","llj");

        return testParam.toString();
    }

    @RequestMapping("/hello")
    public String  hello()
    {
        HashMap<String, String> testParam = new HashMap<>();

        testParam.put("num1","failed");

        return testParam.toString();
    }

    @RequestMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public String login(@RequestParam("username") String userName, @RequestParam("password") String password)
    {
        String name_nn = Optional.ofNullable(userName).orElse("");
        String password_nn = Optional.ofNullable(password).orElse("");
//        return String.format("welcome %s visited,your id is %s",name_nn,password_nn);
        return String.format("欢迎 %s 的访问,你的身份是 %s",name_nn,password_nn);
    }

}
