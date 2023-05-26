package com.rqfreefly.service.log;

import com.rqfreefly.service.constant.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
public class LogEntry implements Serializable {

    private Long index;

    private long term;

    private Command command;

    private String requestId;


}
