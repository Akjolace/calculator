package calculator.app;

public class Subtract extends BinaryOperation{
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    protected int binaryOperation(int x, int y) {
        return 0;
    }
}
