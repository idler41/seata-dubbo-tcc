package com.lfx.tcc.action.impl;

import com.lfx.tcc.action.OrderAction;
import com.lfx.tcc.api.TccActionOne;
import com.lfx.tcc.api.TccActionTwo;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Tcc transaction service.
 *
 * @author zhangsen
 */
public class OrderActionImpl implements OrderAction {

    @Autowired
    private TccActionOne tccActionOne;

    @Autowired
    private TccActionTwo tccActionTwo;

    /**
     * 发起分布式事务
     *
     * @return string string
     */
    @GlobalTransactional
    @Override
    public void createOrder() {
        //第一个TCC 事务参与者
        boolean result = tccActionOne.prepare(null, 1);
        if (!result) {
            throw new RuntimeException("TccActionOne failed.");
        }
        List list = new ArrayList();
        list.add("c1");
        list.add("c2");
        result = tccActionTwo.prepare(null, "two", list);
        if (!result) {
            throw new RuntimeException("TccActionTwo failed.");
        }
    }

}
