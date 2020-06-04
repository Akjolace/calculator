package calculator.app;

public abstract class BinaryOperation implements Expression{

    Expression left, right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int binaryOperation(int x, int y);

    public int evaluate(int x, int y){
        return binaryOperation(left.evaluate(x,y), right.evaluate(x,y));
    }
}
