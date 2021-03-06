package com.luban.dubbo_vip_loadbalance_demo.provider.impl;

import com.luban.dubbo_vip_loadbalance_demo.api.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.RpcContext;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String username) {
        URL url = RpcContext.getContext().getUrl();
        return "hello" + username + String.format("protocol is %s, address is %s ", url.getProtocol(), url.getAddress());
    }
}
