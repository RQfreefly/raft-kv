package com.rqfreefly;

import com.rqfreefly.service.RaftNode;
import com.rqfreefly.service.config.RaftConfig;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;


@Slf4j
public class RaftNodeBootStrap {

    public static void main(String[] args){
        String[] arr = new String[]{"localhost:8775", "localhost:8776", "localhost:8777", "localhost:8778", "localhost:8779"};
        List<String> addrs = RaftConfig.getList();
        Collections.addAll(addrs, arr);
        RaftNode node = new RaftNode();
    }


}
