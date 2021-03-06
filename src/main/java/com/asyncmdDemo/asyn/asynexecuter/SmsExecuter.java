
package com.asyncmdDemo.asyn.asynexecuter;

import com.asyncmd.exception.AsynException;
import com.asyncmd.model.AbstractAsynExecuter;
import com.asyncmdDemo.asyn.asynbiz.SmsBiz;
import com.asyncmdDemo.asyn.asyncmd.SmsAsynCmd;
import org.springframework.stereotype.Service;

/**
 * 短信异步命令执行器
 * @author wangwendi
 * @version $Id: SmsExecuter.java, v 0.1 2019年07月23日 下午9:01 wangwendi Exp $
 */
@Service
public class SmsExecuter extends AbstractAsynExecuter<SmsAsynCmd> {


    @Override
    protected void executer(SmsAsynCmd cmd) {
        SmsBiz content = cmd.getContent();
        System.out.println("发送短信");
        try {
            Thread.sleep(1000L);
        }catch (Exception e){

        }
        throw new RuntimeException("发送短信异常");
    }

}