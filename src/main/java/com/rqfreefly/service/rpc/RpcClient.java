package com.rqfreefly.service.rpc;

import com.alipay.remoting.exception.RemotingException;
import lombok.extern.slf4j.Slf4j;
import com.rqfreefly.service.proto.Request;
import com.rqfreefly.service.proto.Response;

/**
 * RPC 客户端
 */
@Slf4j
public class RpcClient {

    private com.alipay.remoting.rpc.RpcClient CLIENT;

    public RpcClient(){
        CLIENT = new com.alipay.remoting.rpc.RpcClient();
        CLIENT.startup();
    }

    public <R> R send(Request request) throws RemotingException, InterruptedException {
        return send(request, 100);
    }

    public <R> R send(Request request, int timeout) throws RemotingException, InterruptedException {
        Response<R> result;
        result = (Response<R>) CLIENT.invokeSync(request.getUrl(), request, timeout);
        return result.getResult();
    }

    public void destroy() {
        CLIENT.shutdown();
        log.info("destroy success");
    }
}
