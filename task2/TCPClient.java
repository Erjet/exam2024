import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5432);
            System.out.println("Connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println(321);
            out.println(1123);

            int sum = Integer.parseInt(in.readLine());
            System.out.println("Sum: " + sum);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}