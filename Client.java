import java.net.*;
import java.io.*;

public class Client{
       public static void main(String args[]) throws IOException, UnknownHostException {

while(true){

        Socket socket = new Socket("localhost",8080);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
 
        System.out.println("Message recieved " + message);

socket.close();
} 
}


}