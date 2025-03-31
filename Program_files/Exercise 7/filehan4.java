import java.io.FileWriter;
import java.io.IOException;

class filehan4 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); 
            writer.write("\nAppending new line.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
