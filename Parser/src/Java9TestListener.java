// Generated from D:/Projects/CMPILER Projects/ParserMP/Parser/grammar\Java9Test.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java9TestParser}.
 */
public interface Java9TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java9TestParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java9TestParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java9TestParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java9TestParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(Java9TestParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(Java9TestParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(Java9TestParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(Java9TestParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(Java9TestParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(Java9TestParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Java9TestParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Java9TestParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(Java9TestParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(Java9TestParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Java9TestParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Java9TestParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Java9TestParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Java9TestParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java9TestParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java9TestParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(Java9TestParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(Java9TestParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java9TestParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java9TestParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Java9TestParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Java9TestParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(Java9TestParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(Java9TestParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(Java9TestParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(Java9TestParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(Java9TestParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(Java9TestParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(Java9TestParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(Java9TestParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Java9TestParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Java9TestParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Java9TestParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Java9TestParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(Java9TestParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(Java9TestParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(Java9TestParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(Java9TestParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(Java9TestParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(Java9TestParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Java9TestParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Java9TestParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(Java9TestParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(Java9TestParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Java9TestParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Java9TestParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(Java9TestParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(Java9TestParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(Java9TestParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(Java9TestParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(Java9TestParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(Java9TestParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(Java9TestParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(Java9TestParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(Java9TestParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(Java9TestParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java9TestParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java9TestParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(Java9TestParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(Java9TestParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Java9TestParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Java9TestParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(Java9TestParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(Java9TestParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Java9TestParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Java9TestParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java9TestParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java9TestParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Java9TestParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Java9TestParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(Java9TestParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(Java9TestParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(Java9TestParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(Java9TestParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(Java9TestParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(Java9TestParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(Java9TestParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(Java9TestParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(Java9TestParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(Java9TestParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(Java9TestParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(Java9TestParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(Java9TestParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(Java9TestParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(Java9TestParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(Java9TestParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(Java9TestParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(Java9TestParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(Java9TestParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(Java9TestParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Java9TestParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Java9TestParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Java9TestParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Java9TestParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Java9TestParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Java9TestParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(Java9TestParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(Java9TestParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Java9TestParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Java9TestParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(Java9TestParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(Java9TestParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Java9TestParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Java9TestParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(Java9TestParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(Java9TestParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Java9TestParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Java9TestParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(Java9TestParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(Java9TestParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Java9TestParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Java9TestParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java9TestParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java9TestParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(Java9TestParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(Java9TestParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(Java9TestParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(Java9TestParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Java9TestParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Java9TestParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Java9TestParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Java9TestParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(Java9TestParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(Java9TestParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Java9TestParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Java9TestParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(Java9TestParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(Java9TestParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(Java9TestParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(Java9TestParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(Java9TestParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(Java9TestParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(Java9TestParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(Java9TestParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Java9TestParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Java9TestParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(Java9TestParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(Java9TestParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(Java9TestParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(Java9TestParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Java9TestParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Java9TestParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(Java9TestParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(Java9TestParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(Java9TestParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(Java9TestParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(Java9TestParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(Java9TestParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Java9TestParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Java9TestParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(Java9TestParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(Java9TestParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(Java9TestParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(Java9TestParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Java9TestParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Java9TestParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java9TestParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java9TestParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(Java9TestParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(Java9TestParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(Java9TestParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(Java9TestParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(Java9TestParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(Java9TestParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(Java9TestParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(Java9TestParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java9TestParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java9TestParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(Java9TestParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(Java9TestParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Java9TestParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Java9TestParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(Java9TestParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(Java9TestParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(Java9TestParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(Java9TestParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(Java9TestParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(Java9TestParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(Java9TestParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(Java9TestParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(Java9TestParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(Java9TestParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(Java9TestParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(Java9TestParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(Java9TestParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(Java9TestParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Java9TestParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Java9TestParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(Java9TestParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(Java9TestParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(Java9TestParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(Java9TestParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(Java9TestParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(Java9TestParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(Java9TestParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(Java9TestParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(Java9TestParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(Java9TestParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(Java9TestParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(Java9TestParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java9TestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java9TestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(Java9TestParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(Java9TestParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Java9TestParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Java9TestParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Java9TestParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Java9TestParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(Java9TestParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(Java9TestParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Java9TestParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Java9TestParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Java9TestParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Java9TestParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(Java9TestParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(Java9TestParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Java9TestParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Java9TestParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(Java9TestParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(Java9TestParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(Java9TestParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(Java9TestParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Java9TestParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Java9TestParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Java9TestParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Java9TestParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Java9TestParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Java9TestParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(Java9TestParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(Java9TestParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Java9TestParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Java9TestParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Java9TestParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Java9TestParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Java9TestParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Java9TestParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(Java9TestParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(Java9TestParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(Java9TestParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(Java9TestParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(Java9TestParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(Java9TestParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Java9TestParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Java9TestParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(Java9TestParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(Java9TestParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(Java9TestParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(Java9TestParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(Java9TestParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(Java9TestParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(Java9TestParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(Java9TestParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java9TestParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Java9TestParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java9TestParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Java9TestParser.IdentifierContext ctx);
}