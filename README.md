# springboot + dubbo + seata tcc

 参考<a href="https://github.com/seata/seata-samples/tree/master/tcc/springboot-tcc-sample">seata-samples</a>的tcc模块。将TM、RM分开，模拟真正的微服务场景。



## 注意

推荐dubbo与seata都用xml形式配置。因为：

1. 注解形式配置seata在0.8.0版本会有bug。如最近修复：<a href="https://github.com/seata/seata/pull/1566/commits/4919a7de767fff25f553d6b2ab3d38a2fa1754a0#diff-169e8418f80d5d57aa7489db2781c4ab">解决dubbo @service 形式注册服务的时候...</a> 
2. 注解形式要注意seata与dubbo的代理顺序



