// Generated from gem.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link gemParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gemParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gemParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#innerFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerFunctionDeclaration(gemParser.InnerFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(gemParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gemParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(gemParser.Struct_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(gemParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gemParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(gemParser.IfStatementContext ctx);
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
	 * Visit a parse tree produced by {@link gemParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(gemParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(gemParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(gemParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(gemParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(gemParser.ClassDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link gemParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(gemParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(gemParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(gemParser.ArgumentContext ctx);
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
	 * Visit a parse tree produced by {@link gemParser#messageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpression(gemParser.MessageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gemParser#message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_type(gemParser.Message_typeContext ctx);
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
	 * Visit a parse tree produced by {@link gemParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(gemParser.ArrayLiteralContext ctx);
}