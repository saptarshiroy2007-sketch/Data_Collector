package helens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
public static void main(String []args){
	helen h = new helen();
	
	try (Socket socket = new Socket("localhost", 5000)) {
        BufferedReader echoes = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

     //   Scanner scanner = new Scanner(System.in);
        String echoString;
        String response;

        do {
          //  System.out.println("Enter string to be echoed: ");
        //    echoString = scanner.nextLine();
        	h.setVisible(true);
        	echoString=h.getDefaulttablemodel();
            stringToEcho.println(echoString);
           // if(!echoString.equals("exit")) {
                response = echoes.readLine();
                
               
         //   }
        } while(!echoString.equals("exit"));

    } catch (IOException e) {
        System.out.println("Client Error: " + e.getMessage());

    }
	//return "Error";

}
}
