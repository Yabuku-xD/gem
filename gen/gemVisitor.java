// Generated from src/main/antlr4/gem.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gemParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gemParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gemParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(gemParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gemParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(gemParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(gemParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gemParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(gemParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(gemParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(gemParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(gemParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(gemParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(gemParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(gemParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(gemParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(gemParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(gemParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(gemParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#messageDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageDefinition(gemParser.MessageDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(gemParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(gemParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gemParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(gemParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(gemParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(gemParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(gemParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(gemParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(gemParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#messagePassingCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessagePassingCall(gemParser.MessagePassingCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(gemParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(gemParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(gemParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(gemParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(gemParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gemParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(gemParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#arrayDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDimension(gemParser.ArrayDimensionContext ctx);
}