package Ex31.Chat;

import Ex12.Super.Main;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MakeClientSocket {

    public static void main(String[] args){
        new MakeClientSocket();
    }
    Socket socket = null;
    PrintWriter writer = null;
    BufferedReader reader = null;

    public MakeClientSocket(){
        try{
            socket = new Socket("localHost", 3300);
            writer = new PrintWriter(socket.getOutputStream(),true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String str = null;
            BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));

            while((str = sReader.readLine()) != null){
                writer.write(str);
                System.out.println("Out : " + str);
            }

            writer.close();
            reader.close();
            sReader.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
