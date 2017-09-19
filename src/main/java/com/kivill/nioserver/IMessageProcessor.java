package com.kivill.nioserver;

/**
 * Created by kivill on 19-09-2017.
 */
public interface IMessageProcessor {

    public void process(Message message, WriteProxy writeProxy);

}
