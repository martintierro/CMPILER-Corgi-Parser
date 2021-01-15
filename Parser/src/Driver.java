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
        CorgiLexer lexer = new CorgiLexer(cs);  //instantiate a lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        CorgiParser parser = new CorgiParser(tokens);  //parse the tokens

//        Java8Lexer lexer = new Java8Lexer(cs);  //instantiate a lexer
//        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
//        Java8Parser parser = new Java8Parser(tokens);  //parse the tokens
        parser.removeErrorListeners();
        parser.addErrorListener(CustomErrorListener.INSTANCE);

        ParseTree tree = parser.start(); // parse the content and get the tree
//        myListener listener = new myListener();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(listener,tree);

        CorgiBaseVisitor visitor = new CorgiBaseVisitor();
        visitor.visit(tree);
    }
}
