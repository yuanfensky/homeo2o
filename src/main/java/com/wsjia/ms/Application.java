package com.wsjia.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;*/

/**
 * Created by pc on 2016/7/14.
 */
@SpringBootApplication
/*@EnableDiscoveryClient
@EnableHystrix*/
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
