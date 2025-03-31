import java.io.FileWriter;
import java.io.IOException;

class filehan3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
