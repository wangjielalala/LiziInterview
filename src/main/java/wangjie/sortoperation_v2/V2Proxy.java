package wangjie.sortoperation_v2;

import wangjie.sortoperation_v1.IsortOperation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class V2Proxy implements InvocationHandler {
    IsortOperation sortOperation;

    public V2Proxy(IsortOperation sortOperation) {
        this.sortOperation= sortOperation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(sortOperation,args);
        // 可以对result做进一步封装，任何闯过来对List，都会经过一下，优先级队列的排序
        // 可以让实现变得更加的灵活和易于扩展
        return result;
    }
}
