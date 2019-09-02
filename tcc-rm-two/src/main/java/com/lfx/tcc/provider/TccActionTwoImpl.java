package com.lfx.tcc.provider;

import com.lfx.tcc.api.TccActionTwo;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * The type Tcc action two.
 *
 * @author zhangsen
 */
@Service(version = "${pms.service.version}", interfaceName = "tccActionTwo")
public class TccActionTwoImpl implements TccActionTwo {

    @Override
    public boolean prepare(BusinessActionContext actionContext, String b, List list) {
        String xid = actionContext.getXid();
        System.out.println("TccActionTwo prepare, xid:" + xid + ", b:" + b + ", c:" + list.get(1));
//        throw new RuntimeException("test error");
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionTwo commit, xid:" + xid + ", b:" + actionContext.getActionContext("b") + ", c:" + actionContext.getActionContext("c"));
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionTwo rollback, xid:" + xid + ", b:" + actionContext.getActionContext("b") + ", c:" + actionContext.getActionContext("c"));
        return true;
    }

}
