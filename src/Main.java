import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        String content = Files.readString(Paths.get("./LScode/teste2.ls"));

        ArrayList<String> tokens = tokenize(content);

        printTokens(tokens);
    }

    public static ArrayList<String> tokenize(String content){
        ArrayList<String> tokens = new ArrayList<>();

        for (int i = 0; i < content.length(); i++) {
            char ch = content.charAt(i);

            if (ch == ' ') {
                tokens.add("<whit>");
            }

        }

        return tokens;
    }

    public static void printTokens(ArrayList<String> tokensList){
        for(String tok : tokensList){
            System.out.println(tok);
        }
    }
}
