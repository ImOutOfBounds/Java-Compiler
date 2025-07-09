import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] text = new String[]{Files.readString(Paths.get("./LScode/teste.ls"))};

        for(String word : text){
            //System.out.printf(word);
        }
    }
}