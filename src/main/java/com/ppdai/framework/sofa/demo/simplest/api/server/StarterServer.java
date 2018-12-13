package com.ppdai.framework.sofa.demo.simplest.api.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangchengxi
 * Date 2018/11/29
 */
@SpringBootApplication
public class StarterServer {

    public static void main(String[] args) {
        System.setProperty("sofa.middleware.log.disable","true");
        SpringApplication.run(StarterServer.class, args);
//        Thread abc = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("abc");
//            }
//        });
//        abc.start();
    }
}
