package cn.mldn.service.impl;
import cn.mldn.remoteapi.IMessage;
import org.springframework.stereotype.Component;

@Component
public class MessageImpl implements IMessage {
    @Override
    public String echo(String msg) {
        return "MASTER-ECHO:" + msg;
    }
}
