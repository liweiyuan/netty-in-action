package com.tingyun;

import com.tingyun.handler.TimeServerHandler;
import com.tingyun.handler.TimeServerHandlerExecutePool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by spark on 17-4-30.
 */
public class TimeServer {


    public static void main(String[] args) throws IOException {
        int port = 8080;
        ServerSocket server = null;
        try{
            server = new ServerSocket(port);
            System.out.println("The Time server is start in port："+port);
            Socket socket=null;

            /**
             * 通过伪异步的方式来模拟异步操作
             *
             */
            //创建I/O任务线程池
            //-------------------
            TimeServerHandlerExecutePool singleExecutor=
                    new TimeServerHandlerExecutePool(50,10000);
            //--------------------------
            while(true){
                socket=server.accept();
                //BIO形式阻塞
                //new Thread(new TimeServerHandler(socket)).start();
                /**
                 * 通过伪异步的方式来模拟异步操作
                 */
                singleExecutor.execute(new TimeServerHandler(socket));
            }
        }finally {
            if(server!=null){
                System.out.println("The Time server closed");
                server.close();
                server=null;
            }
        }
    }
}
