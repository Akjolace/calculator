package calculator.app;

public class Multiply extends BinaryOperation {

    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    protected int binaryOperation(int x, int y) {
        return 0;
    }
}
