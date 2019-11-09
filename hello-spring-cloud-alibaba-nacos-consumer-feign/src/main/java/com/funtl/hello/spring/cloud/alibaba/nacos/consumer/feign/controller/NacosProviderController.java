package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Program Name: hello-springcloud-alibaba
 * Created by yanlp on 2019-11-09
 *
 * @author yanlp
 * @version 1.0
 */
@RestController
public class NacosProviderController {
    @Autowired
    private NacosProviderService nacosProviderService;


    @GetMapping("/echo")
    public String echo() {
        return nacosProviderService.echo("Hello Feigh");
    }
}
