package L3.Ex1;

import java.io.*;
import java.util.Date;

public class FileService {

    private String fileName;
    private BufferedReader in;
    private PrintWriter out;

    public FileService(String fname) {
        this.fileName = fname;
        try {
            out = new PrintWriter(new FileWriter(fileName, true));
            in = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void write(String msg) {
        Date date = new Date(System.currentTimeMillis());
        out.println("Date: " + date);
        out.println("Message: " + msg);
        out.flush();
    }

    public synchronized String read() throws IOException {
        String iterator, last = "no message to read";
        while ((iterator = in.readLine()) != null) {
            last = new Date(System.currentTimeMillis()) + " - "
                    + iterator;
        }
        return last;
    }
}



