package com.ppdai.framework.sofa.demo.simplest.api.server.impl;


import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.ppdai.framework.sofa.demo.simplest.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author zhangchengxi
 * Date 2018/11/26
 */
@SofaService(interfaceType = HelloService.class, bindings = { @SofaServiceBinding(bindingType = "rest") })
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello" ;
    }

    @Override
    public String sayGoodbye() {
        return "goodbye";
    }
}
