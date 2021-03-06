package com.gs.netty;

import com.gs.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Wang Genshen on 2017-04-18.
 */
public class BasicClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket(Constants.IP, Constants.PORT);
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());
        out.flush();

        Thread.sleep(100000);
    }
}
