import java.io.*;

class BufferedWriterExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        bw.write("Hello World");
        bw.newLine();
        bw.write("This is a BufferedWriter example");

        bw.close();

        System.out.println("Data written to file successfully.");
    }
}