import org.antlr.v4.runtime.tree.ParseTree;

public class myJavaVisitor<T> extends Java9TestBaseVisitor<T>{
    @Override
    public T visitBlock(Java9TestParser.BlockContext ctx){
        T t = visitChildren(ctx);

        System.out.println("Entered block");

        return null;
    }
}
