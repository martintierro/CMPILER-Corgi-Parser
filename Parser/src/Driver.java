import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Driver {
    public static void main(String[] args) {

        CharStream cs = null;  //load the file
        try {
            cs = fromFileName("Parser/IO/program.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Java9TestLexer lexer = new Java9TestLexer(cs);  //instantiate a lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        Java9TestParser parser = new Java9TestParser(tokens);  //parse the tokens

//        Java8Lexer lexer = new Java8Lexer(cs);  //instantiate a lexer
//        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
//        Java8Parser parser = new Java8Parser(tokens);  //parse the tokens
//        parser.removeErrorListeners();
//        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        ParseTree tree = parser.start(); // parse the content and get the tree
        myListener listener = new myListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
    }
}
