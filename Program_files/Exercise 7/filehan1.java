import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class filehan1 {
public static void main(String[] args) {
try {
File file= new File("filehan1.txt");
Scanner sc= new Scanner(file);
while(sc.hasNextLine()) {

String data=sc.nextLine();
System.out.println(data);
}
sc.close();

}
catch (FileNotFoundException e){
System.out.println("file not found");

}
}
}