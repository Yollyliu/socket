package com;


import io.zzax.jadeite.console.Console;
import io.zzax.jadeite.net.Connector;

import java.net.Socket;

public class client {
    public static void main(String[] args) throws Exception {

        System.out.println("1");
        Console.readInt();
        System.out.println("2");
        Socket socket= new Socket("localhost",9999);
        System.out.println("3");

        Console.readInt();
        Connector connector=new Connector(socket);
        connector.writeLine("hello");

        String line=connector.readLine();
        System.out.println(line);







    }
}
