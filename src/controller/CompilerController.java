package controller;

import dto.TokenDTO;
import service.TokenizeService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CompilerController {

    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("./LScode/teste2.ls"));


        ArrayList<TokenDTO> tokens = TokenizeService.tokenize(content);

        TokenizeService.printTokens(tokens);
        TokenizeService.writeCode("./Outputs/resp1.txt", tokens);
    }
}
