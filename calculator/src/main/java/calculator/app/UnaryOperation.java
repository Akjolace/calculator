package calculator.app;

public abstract class UnaryOperation implements Expression {
    Expression expression;

    public UnaryOperation(Expression expression) {
        this.expression = expression;
    }

    protected abstract int unaryOperation(int x);

    public int evaluate(int x, int y){
        return unaryOperation(expression.evaluate(x, y));
    }
}
