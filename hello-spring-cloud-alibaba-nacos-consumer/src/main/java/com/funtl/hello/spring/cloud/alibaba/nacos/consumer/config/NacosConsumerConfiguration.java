package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Program Name: hello-springcloud-alibaba
 * Created by yanlp on 2019-11-09
 *
 * @author yanlp
 * @version 1.0
 */
@Configuration
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
