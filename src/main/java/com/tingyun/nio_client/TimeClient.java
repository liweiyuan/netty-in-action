package com.tingyun.nio_client;

/**
 * Created by spark on 17-5-1.
 */
public class TimeClient {
    public static void main(String[] args) {
        new Thread(new TimeClientHandle("127.0.0.1",8080)).start();
    }
}
