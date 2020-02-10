package net.wanho.mapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Map map){
        map.put("msg","hello11111");
        return "hello";
    }

}
