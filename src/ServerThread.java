import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread implements Runnable {
    Socket s=null;

    @Override
    public void run() {
        InputStream in=s.getInputStream();
    }
}
