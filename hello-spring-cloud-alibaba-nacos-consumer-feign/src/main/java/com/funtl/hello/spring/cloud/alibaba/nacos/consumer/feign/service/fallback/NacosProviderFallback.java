package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

/**
 * Program Name: hello-springcloud-alibaba
 * Created by yanlp on 2019-11-09
 *
 * @author yanlp
 * @version 1.0
 */
@Component
public class NacosProviderFallback implements NacosProviderService {

    @Override
    public String echo(String message) {
        return "网络异常,请稍后再试";
    }
}
