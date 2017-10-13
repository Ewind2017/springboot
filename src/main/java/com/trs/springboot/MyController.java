package com.trs.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:toPull
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: springboot
 * Author: E_wind
 * Create Time:2017/10/12 14:51
 */
@RestController
public class MyController {
    @Value("${that}")
    private String that;

    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    public String hello(){
        return "hello world!" + that;
    }

    /*@RequestMapping(value = "/hello/${user}", method = RequestMethod.GET)
    public String hello(@PathVariable("user") String user){
        return "hello world!" + that +user;
    }*/

    /*@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }*/
}
