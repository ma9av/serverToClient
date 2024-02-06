import java.net.*;
import java.io.*;
import java.util.*;

public class Server{

          public static void main(String args[]) throws IOException, UnknownHostException {
          
          ServerSocket serverSocket = new ServerSocket(8080);
          Scanner sc = new Scanner(System.in);  
          while(true){
                 
               Socket socket = serverSocket.accept();
               System.out.println("Connection Established");

               PrintStream printStream = new PrintStream(socket.getOutputStream());
               System.out.println("Enter message: ");
           
               String message = sc.nextLine();
               printStream.print(message);

socket.close();
        

              }


       }
}