// Generated from D:/Projects/CMPILER Projects/ParserMP/Parser/grammar\Corgi.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java9TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java9TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java9TestParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java9TestParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(Java9TestParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java9TestParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java9TestParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java9TestParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java9TestParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java9TestParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java9TestParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java9TestParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java9TestParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java9TestParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java9TestParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(Java9TestParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(Java9TestParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java9TestParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(Java9TestParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Java9TestParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Java9TestParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(Java9TestParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java9TestParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java9TestParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java9TestParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java9TestParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java9TestParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(Java9TestParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(Java9TestParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(Java9TestParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java9TestParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(Java9TestParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java9TestParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java9TestParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Java9TestParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(Java9TestParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Java9TestParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java9TestParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java9TestParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Java9TestParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(Java9TestParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java9TestParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Java9TestParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(Java9TestParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(Java9TestParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java9TestParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(Java9TestParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(Java9TestParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(Java9TestParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java9TestParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Java9TestParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java9TestParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(Java9TestParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java9TestParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java9TestParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java9TestParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Java9TestParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java9TestParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java9TestParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java9TestParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java9TestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(Java9TestParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(Java9TestParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java9TestParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java9TestParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(Java9TestParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java9TestParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(Java9TestParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(Java9TestParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(Java9TestParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(Java9TestParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java9TestParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(Java9TestParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java9TestParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java9TestParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(Java9TestParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(Java9TestParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(Java9TestParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java9TestParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Java9TestParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(Java9TestParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java9TestParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java9TestParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(Java9TestParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java9TestParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(Java9TestParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(Java9TestParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java9TestParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java9TestParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(Java9TestParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Java9TestParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java9TestParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java9TestParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java9TestParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java9TestParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java9TestParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java9TestParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(Java9TestParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java9TestParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java9TestParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java9TestParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(Java9TestParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java9TestParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java9TestParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java9TestParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java9TestParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java9TestParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Java9TestParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java9TestParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Java9TestParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java9TestParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java9TestParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java9TestParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java9TestParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java9TestParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java9TestParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java9TestParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java9TestParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java9TestParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java9TestParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java9TestParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java9TestParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java9TestParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java9TestParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java9TestParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java9TestParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java9TestParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java9TestParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java9TestParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java9TestParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java9TestParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9TestParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Java9TestParser.IdentifierContext ctx);
}