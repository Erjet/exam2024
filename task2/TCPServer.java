import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5432);
            System.out.println("Connecting..");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client Connected.");

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                int num1 = Integer.parseInt(in.readLine());
                int num2 = Integer.parseInt(in.readLine());

                int sum = num1 + num2;

                out.println(sum);

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}