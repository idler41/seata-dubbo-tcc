package com.lfx.tcc.provider;

import com.lfx.tcc.api.TccActionOne;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.apache.dubbo.config.annotation.Service;


/**
 * The type Tcc action one.
 *
 * @author zhangsen
 */
@Service(version = "${oms.service.version}", interfaceName = "tccActionOne")
public class TccActionOneImpl implements TccActionOne {

    @Override
    public boolean prepare(BusinessActionContext actionContext, int a) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne prepare, xid:" + xid + ", a:" + a);
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne commit, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TccActionOne rollback, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
        return true;
    }
}
