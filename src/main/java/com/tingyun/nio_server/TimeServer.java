package com.tingyun.nio_server;

import java.io.IOException;

/**
 * Created by spark on 17-4-30.
 */
public class TimeServer {
    /**
     * NIO服务端
     *
     * @param args
     */
    public static void main(String[] args) throws IOException{
        int port = 8080;
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new  Thread(timeServer,"NIO-MultiplexerTimeServer-001").start();
    }
}
