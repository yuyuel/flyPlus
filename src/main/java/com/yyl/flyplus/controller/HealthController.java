package com.yyl.flyplus.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
* @Description:    健康检查
* @Author:         Truth
* @CreateDate:     2019/4/21 17:19
* @Version:        1.0
*/
@Controller
@RequestMapping(value = "/check")
@Api(value = "HealthController|一个用来测试swagger注解的控制器")
public class HealthController extends BaseController {


    private Logger LOG = LoggerFactory.getLogger(HealthController.class);


    @ResponseBody
    @RequestMapping(value = "/health", method= RequestMethod.GET)
    @ApiOperation(value="检查后台系统健康状态", notes="检查后台系统健康状态")
    public String healthCheck(){
        return "health";
    }

}
