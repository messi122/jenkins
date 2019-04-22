package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: com.example.jenkins.controller
 * @Author: yuyong
 * @CreateDate: 2019/4/22 11:15
 * @UpdateUser:
 * @UpdateDate: 2019/4/22 11:15
 * @UpdateRemark:
 * @Version: 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping(value = "/")
    public String index(){
        return "hello messi !!!!";
    }
}
