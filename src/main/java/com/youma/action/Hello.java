/**
 * Copyright (C),2015-2018
 * FileNmae: Hello
 * Author:   Administrator
 * Date:     2018/10/25 9:36
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/25 9:36
 */
@Controller
public class Hello {
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String hello(ModelMap map) {
        map.addAttribute("message", "北京欢迎你");
        System.out.println("aaaaa");
        return "hello";
    }
}
