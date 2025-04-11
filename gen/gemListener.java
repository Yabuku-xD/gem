// Generated from src/main/antlr4/gem.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link gemParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(gemParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(gemParser.LvalueContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gemParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gemParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(gemParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(gemParser.LoopStatementContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(gemParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(gemParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(gemParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(gemParser.StructDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(gemParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(gemParser.ClassDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#messageDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMessageDefinition(gemParser.MessageDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#messageDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMessageDefinition(gemParser.MessageDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#messagePassingCall}.
	 * @param ctx the parse tree
	 */
	void enterMessagePassingCall(gemParser.MessagePassingCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#messagePassingCall}.
	 * @param ctx the parse tree
	 */
	void exitMessagePassingCall(gemParser.MessagePassingCallContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(gemParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(gemParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(gemParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(gemParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(gemParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(gemParser.MemberAccessContext ctx);
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
	 * Enter a parse tree produced by {@link gemParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(gemParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(gemParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gemParser#arrayDimension}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimension(gemParser.ArrayDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gemParser#arrayDimension}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimension(gemParser.ArrayDimensionContext ctx);
}