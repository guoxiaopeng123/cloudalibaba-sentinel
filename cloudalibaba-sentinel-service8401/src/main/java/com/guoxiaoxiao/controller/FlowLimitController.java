package com.guoxiaoxiao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Timer;
import java.util.concurrent.TimeUnit;
/**
 * @Classname FlowLimitController
 * @Description TODO
 * @Date 2021/4/26 16:12
 * @Created by GUOXIAOXIAO
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        try {
        }catch (Exception e){
            e.printStackTrace();
        }
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "----testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try{
        TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "----testD";
    }

}
