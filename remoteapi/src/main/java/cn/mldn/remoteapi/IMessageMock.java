package cn.mldn.remoteapi;

public class IMessageMock implements IMessage {
    @Override
    public String echo(String msg) {
        return "nothing";
    }
}
