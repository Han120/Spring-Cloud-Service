package com.ahut.business.controller;

import com.ahut.api.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author hanzijian
 * @description:
 * @create 2021-05-21 16:16
 */
@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("ConstantConditions")
    @RequestMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }


    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }

}
