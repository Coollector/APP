package com.coollector.tests.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Main {
    static Thread sent;
    static Socket socket;

    public static void main(String[] args){
        try {
            socket = new Socket("localhost",9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sent = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    BufferedReader stdIn =new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    while(true){
                        System.out.println("Trying to read...");
                        String in = stdIn.readLine();
                        System.out.println(in);
                        out.print("Try"+"\r\n");
                        System.out.println("Message sent");
                        System.out.println("das ist ein test für eine neue branche");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        sent.start();
        try {
            sent.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}