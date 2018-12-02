package com;

import io.zzax.jadeite.net.Connector;

import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) throws Exception {
        System.out.println("1");
        ServerSocket serverSocket=new ServerSocket(9999);
        System.out.println("2");
        Socket socket=serverSocket.accept();
        System.out.println("3");

        Connector connector=new Connector(socket);
        String line=connector.readLine();

        System.out.println("4");
        System.out.println(line);
        connector.writeLine("got it");


    }
}
