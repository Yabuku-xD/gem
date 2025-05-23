// Generated from gem.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gemParser}.
 */
public interface gemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gemParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gemParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gemParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gemParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gemParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gemParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gemParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#innerFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInnerFunctionDeclaration(gemParser.InnerFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#innerFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInnerFunctionDeclaration(gemParser.InnerFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(gemParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(gemParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gemParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gemParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(gemParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(gemParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(gemParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(gemParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gemParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gemParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(gemParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(gemParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(gemParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(gemParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(gemParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(gemParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(gemParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(gemParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(gemParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(gemParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(gemParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(gemParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#messageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMessageDeclaration(gemParser.MessageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#messageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMessageDeclaration(gemParser.MessageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(gemParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(gemParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(gemParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(gemParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(gemParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(gemParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(gemParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(gemParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(gemParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(gemParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(gemParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(gemParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(gemParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(gemParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(gemParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(gemParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(gemParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(gemParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(gemParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(gemParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(gemParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(gemParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gemParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gemParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(gemParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(gemParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(gemParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(gemParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(gemParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(gemParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(gemParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(gemParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void enterMessageExpression(gemParser.MessageExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void exitMessageExpression(gemParser.MessageExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#message_type}.
	 * @param ctx the parse tree
	 */
	void enterMessage_type(gemParser.Message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#message_type}.
	 * @param ctx the parse tree
	 */
	void exitMessage_type(gemParser.Message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(gemParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(gemParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gemParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gemParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(gemParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(gemParser.ArrayLiteralContext ctx);
}