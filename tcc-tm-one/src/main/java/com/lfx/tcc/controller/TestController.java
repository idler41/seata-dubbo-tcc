package com.lfx.tcc.controller;

import com.lfx.tcc.action.OrderAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:idler41@163.com">idler41</a>
 * @date 2019-09-01 17:51
 */
@RestController
@RequestMapping("/order")
public class TestController {

    @Autowired
    private OrderAction orderAction;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void test() {
        orderAction.createOrder();
    }
}
