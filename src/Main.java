import dto.TokenDTO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static ArrayList<TokenDTO> tokenize(String content){
        ArrayList<TokenDTO> tokens = new ArrayList<>();

        StringBuilder currentString = new StringBuilder();
        int varId = 0;

        for (int i = 0; i < content.length(); i++) {
            char ch = content.charAt(i);

            if (ch == ' ' || ch == '\n') {
                String tokenType = verifyTokenType(currentString.toString());

                if (tokenType.equals("id"))
                    tokens.add(new TokenDTO(tokenType, currentString.toString(), varId++));

                else if (tokenType.equals("num")) {
                    tokens.add(new TokenDTO(tokenType));
                }

                else
                    tokens.add(new TokenDTO(tokenType));

                currentString = new StringBuilder();

                if (ch == '\n')
                    tokens.add(new TokenDTO("EOL"));

            } else {
                if (ch == '\'' || ch == '(' || ch == ')') {
                    if (!currentString.toString().isBlank()) {

                        tokens.add(new TokenDTO("str"));
                        currentString = new StringBuilder();
                    }
                    tokens.add(new TokenDTO(Character.toString(ch)));
                }

                else
                    currentString.append(ch);
            }

        }

        return tokens;
    }

    public static void printTokens(ArrayList<TokenDTO> tokensList){
        for(TokenDTO tok : tokensList){
            System.out.println(tok);
        }
    }

    public static String verifyTokenType(String word){

        char ch = word.charAt(0);

        if (word.equals("=") || word.equals("==") || word.equals(">=") || word.equals("<=") || word.equals("*")
                || word.equals("+") || word.equals("-") || word.equals("#") || word.equals("/") || word.equals("fun")
                || word.equals("(") || word.equals(")") || word.equals("{") || word.equals("}") || word.equals("var")
        )
            return word;

        if (word.equals("int") || word.equals("String") || word.equals("Double"))
            return "typ";

        if (Character.isDigit(ch)) {
            return "num";
        }

        return "id";
    }

    public static void main(String[] args) throws IOException {

        String content = Files.readString(Paths.get("./LScode/teste2.ls"));

        ArrayList<TokenDTO> tokens = tokenize(content);

        printTokens(tokens);
    }
}
